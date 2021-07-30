package org.scalablytyped.converter.internal
package scalajs
package flavours

import org.scalablytyped.converter.internal.scalajs.ExprTree._

class JapgollyMemberToProp(reactNames: ReactNamesProxy, rewrites: IArray[CastConversion], effectAgnostic: Boolean)
    extends MemberToProp {
  val default = new MemberToProp.Default(rewrites)

  override def apply(scope: TreeScope, x: MemberTree, isInherited: Boolean): Option[Prop] =
    default(scope, x, isInherited).map {
      case prop: Prop.Normal => prop.rewrite(toScalaJsReact)
      case other => other
    }

  val Callback = TypeRef(JapgollyNames.Callback)

  /**
    *- If the method return value is Unit, then convert it to Callback
    *- If the method return value is TYPE, then convert it to Callback[Type]
    */
  def CallbackTo(ref: TypeRef): TypeRef =
    ref match {
      case TypeRef.Unit => Callback
      case other        => TypeRef(JapgollyNames.CallbackTo, IArray(other), NoComments)
    }

  val F = TypeParamTree(
    Name("F"),
    IArray(TypeParamTree(Name.WILDCARD_KIND, Empty, None, None, NoComments, ignoreBound = false)),
    typeBound = Some(TypeRef(JapgollyNames.Sync)),
    None,
    NoComments,
    ignoreBound = false,
  )

  def F(ref: TypeRef): TypeRef =
    TypeRef(QualifiedName(IArray(F.name)), IArray(ref), NoComments)

  val FSync = TApply(Ref(Name("implicitly")), IArray(TypeRef(JapgollyNames.Sync, IArray(TypeRef(F.name)), NoComments)))

  def toScalaJsReact(variant: Prop.Variant): Prop.Variant =
    variant.tpe match {
      case TypeRef.ScalaFunction(Empty, retType) if effectAgnostic =>
        Prop.Variant(
          F(retType),
          ref => Call(FSync.select("toJsFn"), IArray(IArray(ref))),
          isRewritten   = true,
          extendsAnyVal = true,
          agnostic      = Some(EffectAgnostic(F)),
        )

      case TypeRef.ScalaFunction(Empty, retType) =>
        Prop.Variant(
          CallbackTo(retType),
          ref => Select(ref, Name("toJsFn")),
          isRewritten   = true,
          extendsAnyVal = true,
          agnostic      = None,
        )

      case TypeRef.ScalaFunction(paramTypes, TypeRef.Unit) if effectAgnostic =>
        def fn(ref: ExprTree): ExprTree = {
          val params = paramTypes.zipWithIndex.map {
            case (tpe, i) =>
              ParamTree(Name(s"t$i"), isImplicit = false, isVal = false, tpe, NotImplemented, NoComments)
          }
          val body = {
            Call(
              FSync.select("runSync"),
              IArray(IArray(Call(ref, IArray(params.map(p => Ref(p.name)))))),
            )
          }

          Call(Ref(QualifiedName.JsAny + Name(s"fromFunction${params.length}")), IArray(IArray(Lambda(params, body))))
        }

        Prop.Variant(
          tpe           = TypeRef.ScalaFunction(paramTypes, F(TypeRef.Unit), NoComments),
          asExpr        = fn,
          isRewritten   = true,
          extendsAnyVal = false,
          agnostic      = Some(EffectAgnostic(F)),
        )

      case TypeRef.ScalaFunction(paramTypes, TypeRef.Unit) =>
        def fn(ref: ExprTree): ExprTree = {
          val params = paramTypes.zipWithIndex.map {
            case (tpe, i) =>
              ParamTree(Name(s"t$i"), isImplicit = false, isVal = false, tpe, NotImplemented, NoComments)
          }
          val body =
            Call(Select(Call(ref, IArray(params.map(p => Ref(p.name)))), Name("runNow")), IArray(IArray()))

          Call(Ref(QualifiedName.JsAny + Name(s"fromFunction${params.length}")), IArray(IArray(Lambda(params, body))))
        }

        Prop.Variant(
          tpe           = TypeRef.ScalaFunction(paramTypes, Callback, NoComments),
          asExpr        = fn,
          isRewritten   = true,
          extendsAnyVal = false,
          agnostic      = None,
        )
      case TypeRef(tpe, _, _) if reactNames.isElement(tpe) =>
        Prop.Variant(
          TypeRef(JapgollyNames.vdom.ReactElement),
          ref => Cast(Select(ref, Name("rawElement")), TypeRef.JsAny),
          isRewritten   = true,
          extendsAnyVal = false,
          agnostic      = None,
        )
      case TypeRef(tpe, _, _) if reactNames.isNode(tpe) =>
        Prop.Variant(
          TypeRef(JapgollyNames.vdom.VdomNode),
          ref => Cast(Select(ref, Name("rawNode")), TypeRef.JsAny),
          isRewritten   = true,
          extendsAnyVal = false,
          agnostic      = None,
        )
      case _ => variant
    }
}

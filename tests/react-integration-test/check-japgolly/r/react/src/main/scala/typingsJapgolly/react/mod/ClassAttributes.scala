package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassAttributes[T]
  extends StObject
     with Attributes {
  
  var ref: js.UndefOr[LegacyRef[T]] = js.undefined
}
object ClassAttributes {
  
  inline def apply[T](): ClassAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassAttributes[T]]
  }
  
  extension [Self <: ClassAttributes[?], T](x: Self & ClassAttributes[T]) {
    
    inline def setRef(value: LegacyRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1[F[_]: Sync](value: /* instance */ T | Null => F[Unit]): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: /* instance */ T | Null) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}

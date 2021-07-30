package typingsJapgolly.stardustUiReactComponentRef.components

import japgolly.scalajs.react.util.Effect.Sync
import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_RefProps171925374[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def innerRef(value: typingsJapgolly.react.mod.Ref[js.Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
  
  inline def innerRefFunction1[F[_]: Sync](value: /* instance */ js.Any | Null => F[Unit]): this.type = set("innerRef", js.Any.fromFunction1((t0: /* instance */ js.Any | Null) => implicitly[Sync[F]].runSync(value(t0))))
  
  inline def innerRefNull: this.type = set("innerRef", null)
}

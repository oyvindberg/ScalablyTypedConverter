package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildContextProvider[CC] extends StObject {
  
  def getChildContext(): CC
}
object ChildContextProvider {
  
  inline def apply[F[_]: Sync, CC](getChildContext: F[CC]): ChildContextProvider[CC] = {
    val __obj = js.Dynamic.literal(getChildContext = implicitly[Sync[F]].toJsFn(getChildContext))
    __obj.asInstanceOf[ChildContextProvider[CC]]
  }
  
  extension [Self <: ChildContextProvider[?], CC](x: Self & ChildContextProvider[CC]) {
    
    inline def setGetChildContext[F[_]: Sync](value: F[CC]): Self = StObject.set(x, "getChildContext", implicitly[Sync[F]].toJsFn(value))
  }
}

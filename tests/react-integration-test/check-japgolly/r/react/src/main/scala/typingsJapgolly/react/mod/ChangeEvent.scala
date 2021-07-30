package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeEvent[T]
  extends StObject
     with BaseSyntheticEvent[Event, EventTarget & T, EventTarget] {
  
  @JSName("target")
  var target_ChangeEvent: EventTarget & T
}
object ChangeEvent {
  
  inline def apply[F[_]: Sync, T](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: EventTarget & T,
    defaultPrevented: Boolean,
    eventPhase: Double,
    isDefaultPrevented: F[Boolean],
    isPropagationStopped: F[Boolean],
    isTrusted: Boolean,
    nativeEvent: Event,
    persist: F[Unit],
    preventDefault: F[Unit],
    stopPropagation: F[Unit],
    target: EventTarget & T,
    timeStamp: Double,
    `type`: String
  ): ChangeEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = implicitly[Sync[F]].toJsFn(isDefaultPrevented), isPropagationStopped = implicitly[Sync[F]].toJsFn(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = implicitly[Sync[F]].toJsFn(persist), preventDefault = implicitly[Sync[F]].toJsFn(preventDefault), stopPropagation = implicitly[Sync[F]].toJsFn(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[T]]
  }
  
  extension [Self <: ChangeEvent[?], T](x: Self & ChangeEvent[T]) {
    
    inline def setTarget(value: EventTarget & T): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}

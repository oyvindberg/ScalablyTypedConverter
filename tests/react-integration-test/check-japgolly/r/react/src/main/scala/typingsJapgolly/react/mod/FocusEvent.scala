package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalajs.dom.raw.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusEvent[T]
  extends StObject
     with BaseSyntheticEvent[NativeFocusEvent, EventTarget & T, EventTarget] {
  
  var relatedTarget: EventTarget
  
  @JSName("target")
  var target_FocusEvent: EventTarget & T
}
object FocusEvent {
  
  inline def apply[F[_]: Sync, T](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: EventTarget & T,
    defaultPrevented: Boolean,
    eventPhase: Double,
    isDefaultPrevented: F[Boolean],
    isPropagationStopped: F[Boolean],
    isTrusted: Boolean,
    nativeEvent: NativeFocusEvent,
    persist: F[Unit],
    preventDefault: F[Unit],
    relatedTarget: EventTarget,
    stopPropagation: F[Unit],
    target: EventTarget & T,
    timeStamp: Double,
    `type`: String
  ): FocusEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = implicitly[Sync[F]].toJsFn(isDefaultPrevented), isPropagationStopped = implicitly[Sync[F]].toJsFn(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = implicitly[Sync[F]].toJsFn(persist), preventDefault = implicitly[Sync[F]].toJsFn(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], stopPropagation = implicitly[Sync[F]].toJsFn(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusEvent[T]]
  }
  
  extension [Self <: FocusEvent[?], T](x: Self & FocusEvent[T]) {
    
    inline def setRelatedTarget(value: EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: EventTarget & T): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}

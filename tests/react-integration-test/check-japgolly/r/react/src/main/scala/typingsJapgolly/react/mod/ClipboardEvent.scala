package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalajs.dom.raw.DataTransfer
import org.scalajs.dom.raw.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipboardEvent[T]
  extends StObject
     with BaseSyntheticEvent[NativeClipboardEvent, EventTarget & T, EventTarget] {
  
  var clipboardData: DataTransfer
}
object ClipboardEvent {
  
  inline def apply[F[_]: Sync, T](
    bubbles: Boolean,
    cancelable: Boolean,
    clipboardData: DataTransfer,
    currentTarget: EventTarget & T,
    defaultPrevented: Boolean,
    eventPhase: Double,
    isDefaultPrevented: F[Boolean],
    isPropagationStopped: F[Boolean],
    isTrusted: Boolean,
    nativeEvent: NativeClipboardEvent,
    persist: F[Unit],
    preventDefault: F[Unit],
    stopPropagation: F[Unit],
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  ): ClipboardEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clipboardData = clipboardData.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = implicitly[Sync[F]].toJsFn(isDefaultPrevented), isPropagationStopped = implicitly[Sync[F]].toJsFn(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = implicitly[Sync[F]].toJsFn(persist), preventDefault = implicitly[Sync[F]].toJsFn(preventDefault), stopPropagation = implicitly[Sync[F]].toJsFn(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardEvent[T]]
  }
  
  extension [Self <: ClipboardEvent[?], T](x: Self & ClipboardEvent[T]) {
    
    inline def setClipboardData(value: DataTransfer): Self = StObject.set(x, "clipboardData", value.asInstanceOf[js.Any])
  }
}

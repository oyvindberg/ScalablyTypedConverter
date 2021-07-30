package typingsJapgolly.react.mod

import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.util.Effect.Sync
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.anon.Html
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMAttributes[T] extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onBeforeInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[T]] = js.undefined
  
  var onCanPlay: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onContextMenu: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onCut: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onDrag: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragExit: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragOver: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragStart: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDrop: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDurationChange: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onEmptied: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onEncrypted: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onEnded: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onError: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[T]] = js.undefined
  
  var onInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onInvalid: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onLoadStart: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onLoadedData: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onMouseDown: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseMove: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseOut: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseOver: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseUp: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onPaste: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onPause: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onPlay: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onPlaying: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onProgress: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onRateChange: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onReset: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[T]] = js.undefined
  
  var onSeeked: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onSeeking: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onStalled: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onSubmit: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onSuspend: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onTimeUpdate: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.undefined
  
  var onVolumeChange: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onWaiting: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[T]] = js.undefined
}
object DOMAttributes {
  
  inline def apply[T](): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMAttributes[T]]
  }
  
  extension [Self <: DOMAttributes[?], T](x: Self & DOMAttributes[T]) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    inline def setOnAbort[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnAnimationEnd[F[_]: Sync](value: ReactAnimationEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationIteration[F[_]: Sync](value: ReactAnimationEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    inline def setOnAnimationStart[F[_]: Sync](value: ReactAnimationEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnAuxClick[F[_]: Sync](value: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    inline def setOnBeforeInput[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    inline def setOnBlur[F[_]: Sync](value: ReactFocusEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCanPlay[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnCanPlayThrough[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    inline def setOnChange[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick[F[_]: Sync](value: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCompositionEnd[F[_]: Sync](value: ReactCompositionEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    inline def setOnCompositionStart[F[_]: Sync](value: ReactCompositionEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    inline def setOnCompositionUpdate[F[_]: Sync](value: ReactCompositionEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    inline def setOnContextMenu[F[_]: Sync](value: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnCopy[F[_]: Sync](value: ReactClipboardEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut[F[_]: Sync](value: ReactClipboardEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDoubleClick[F[_]: Sync](value: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnDrag[F[_]: Sync](value: ReactDragEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnDragEnd[F[_]: Sync](value: ReactDragEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragEnter[F[_]: Sync](value: ReactDragEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    inline def setOnDragExit[F[_]: Sync](value: ReactDragEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    inline def setOnDragLeave[F[_]: Sync](value: ReactDragEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnDragOver[F[_]: Sync](value: ReactDragEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    inline def setOnDragStart[F[_]: Sync](value: ReactDragEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnDrop[F[_]: Sync](value: ReactDragEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnDurationChange[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    inline def setOnEmptied[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    inline def setOnEncrypted[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    inline def setOnEnded[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFocus[F[_]: Sync](value: ReactFocusEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnInput[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnInvalid[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    inline def setOnKeyDown[F[_]: Sync](value: ReactKeyboardEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyPress[F[_]: Sync](value: ReactKeyboardEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setOnKeyUp[F[_]: Sync](value: ReactKeyboardEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnLoad[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnLoadStart[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnLoadedData[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    inline def setOnLoadedMetadata[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    inline def setOnMouseDown[F[_]: Sync](value: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter[F[_]: Sync](value: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave[F[_]: Sync](value: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove[F[_]: Sync](value: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut[F[_]: Sync](value: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseOver[F[_]: Sync](value: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    inline def setOnMouseUp[F[_]: Sync](value: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnPaste[F[_]: Sync](value: ReactClipboardEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnPause[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnPlaying[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    inline def setOnPointerCancel[F[_]: Sync](value: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown[F[_]: Sync](value: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter[F[_]: Sync](value: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave[F[_]: Sync](value: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove[F[_]: Sync](value: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerOut[F[_]: Sync](value: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    inline def setOnPointerOver[F[_]: Sync](value: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    inline def setOnPointerUp[F[_]: Sync](value: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnProgress[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnRateChange[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    inline def setOnReset[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnScroll[F[_]: Sync](value: ReactUIEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSeeked[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    inline def setOnSeeking[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    inline def setOnSelect[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnStalled[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    inline def setOnSubmit[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setOnSuspend[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    inline def setOnTimeUpdate[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    inline def setOnTouchCancel[F[_]: Sync](value: ReactTouchEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd[F[_]: Sync](value: ReactTouchEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove[F[_]: Sync](value: ReactTouchEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart[F[_]: Sync](value: ReactTouchEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTransitionEnd[F[_]: Sync](value: ReactTransitionEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    inline def setOnVolumeChange[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    inline def setOnWaiting[F[_]: Sync](value: ReactEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    inline def setOnWheel[F[_]: Sync](value: ReactWheelEventFrom[T & org.scalajs.dom.raw.Element] => F[Unit]): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[T & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
  }
}

package typingsJapgolly.reactDropzone.components

import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.util.Effect.Sync
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactDropzone.mod.DropEvent
import typingsJapgolly.reactDropzone.mod.DropzoneProps
import typingsJapgolly.reactDropzone.mod.DropzoneRef
import typingsJapgolly.reactDropzone.mod.DropzoneState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDropzone {
  
  @JSImport("react-dropzone", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[DropzoneRef] {
    
    inline def accept(value: String | js.Array[String]): this.type = set("accept", value.asInstanceOf[js.Any])
    
    inline def acceptVarargs(value: String*): this.type = set("accept", js.Array(value :_*))
    
    inline def children(value: /* state */ DropzoneState => Element): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def getFilesFromEvent(
      value: /* event */ DropEvent => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Promise<Array<File | DataTransferItem>> */ js.Any
    ): this.type = set("getFilesFromEvent", js.Any.fromFunction1(value))
    
    inline def maxSize(value: Double): this.type = set("maxSize", value.asInstanceOf[js.Any])
    
    inline def minSize(value: Double): this.type = set("minSize", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def noClick(value: Boolean): this.type = set("noClick", value.asInstanceOf[js.Any])
    
    inline def noDrag(value: Boolean): this.type = set("noDrag", value.asInstanceOf[js.Any])
    
    inline def noDragEventsBubbling(value: Boolean): this.type = set("noDragEventsBubbling", value.asInstanceOf[js.Any])
    
    inline def noKeyboard(value: Boolean): this.type = set("noKeyboard", value.asInstanceOf[js.Any])
    
    inline def onDragEnter[F[_]: Sync](value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onDragLeave[F[_]: Sync](value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onDragOver[F[_]: Sync](value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onDrop[F[_]: Sync](
      value: (/* acceptedFiles */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ js.Any
        ], /* rejectedFiles */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ js.Any
        ], /* event */ DropEvent) => F[Unit]
    ): this.type = set("onDrop", js.Any.fromFunction3((t0: /* acceptedFiles */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ js.Any
        ], t1: /* rejectedFiles */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ js.Any
        ], t2: /* event */ DropEvent) => implicitly[Sync[F]].runSync(value(t0, t1, t2))))
    
    inline def onDropAccepted[F[_]: Sync](
      value: (/* files */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ js.Any
        ], /* event */ DropEvent) => F[Unit]
    ): this.type = set("onDropAccepted", js.Any.fromFunction2((t0: /* files */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ js.Any
        ], t1: /* event */ DropEvent) => implicitly[Sync[F]].runSync(value(t0, t1))))
    
    inline def onDropRejected[F[_]: Sync](
      value: (/* files */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ js.Any
        ], /* event */ DropEvent) => F[Unit]
    ): this.type = set("onDropRejected", js.Any.fromFunction2((t0: /* files */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ js.Any
        ], t1: /* event */ DropEvent) => implicitly[Sync[F]].runSync(value(t0, t1))))
    
    inline def onFileDialogCancel[F[_]: Sync](value: F[Unit]): this.type = set("onFileDialogCancel", implicitly[Sync[F]].toJsFn(value))
    
    inline def preventDropOnDocument(value: Boolean): this.type = set("preventDropOnDocument", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactDropzone.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropzoneProps & RefAttributes[DropzoneRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

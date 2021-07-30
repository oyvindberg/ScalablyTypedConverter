package typingsJapgolly.semanticUiReact.components

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
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.react.reactStrings.`additions text`
import typingsJapgolly.react.reactStrings.`inline`
import typingsJapgolly.react.reactStrings.additions
import typingsJapgolly.react.reactStrings.all
import typingsJapgolly.react.reactStrings.ascending
import typingsJapgolly.react.reactStrings.assertive
import typingsJapgolly.react.reactStrings.both
import typingsJapgolly.react.reactStrings.button
import typingsJapgolly.react.reactStrings.copy
import typingsJapgolly.react.reactStrings.date
import typingsJapgolly.react.reactStrings.descending
import typingsJapgolly.react.reactStrings.dialog
import typingsJapgolly.react.reactStrings.execute
import typingsJapgolly.react.reactStrings.grammar
import typingsJapgolly.react.reactStrings.grid
import typingsJapgolly.react.reactStrings.horizontal
import typingsJapgolly.react.reactStrings.link
import typingsJapgolly.react.reactStrings.list
import typingsJapgolly.react.reactStrings.listbox
import typingsJapgolly.react.reactStrings.location
import typingsJapgolly.react.reactStrings.menu
import typingsJapgolly.react.reactStrings.mixed
import typingsJapgolly.react.reactStrings.move
import typingsJapgolly.react.reactStrings.none
import typingsJapgolly.react.reactStrings.off
import typingsJapgolly.react.reactStrings.on
import typingsJapgolly.react.reactStrings.other
import typingsJapgolly.react.reactStrings.page
import typingsJapgolly.react.reactStrings.polite
import typingsJapgolly.react.reactStrings.popup
import typingsJapgolly.react.reactStrings.removals
import typingsJapgolly.react.reactStrings.reset
import typingsJapgolly.react.reactStrings.spelling
import typingsJapgolly.react.reactStrings.step
import typingsJapgolly.react.reactStrings.submit
import typingsJapgolly.react.reactStrings.text
import typingsJapgolly.react.reactStrings.time
import typingsJapgolly.react.reactStrings.tree
import typingsJapgolly.semanticUiReact.buttonContentMod.ButtonContentProps
import typingsJapgolly.semanticUiReact.buttonGroupMod.ButtonGroupProps
import typingsJapgolly.semanticUiReact.buttonMod.ButtonProps
import typingsJapgolly.semanticUiReact.buttonMod.StrictButtonProps
import typingsJapgolly.semanticUiReact.buttonMod.default
import typingsJapgolly.semanticUiReact.buttonOrMod.ButtonOrProps
import typingsJapgolly.semanticUiReact.genericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.genericMod.SemanticFLOATS
import typingsJapgolly.semanticUiReact.genericMod.SemanticSIZES
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`google plus`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.facebook
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.fade
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.instagram
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.left
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.linkedin
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.right
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.twitter
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.vertical
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.vk
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.youtube
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Button {
  
  object Content {
    
    @JSImport("semantic-ui-react/dist/commonjs/elements/Button/Button", "default.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_ButtonContentProps1680783343 = new SharedBuilder_ButtonContentProps1680783343(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ButtonContentProps): SharedBuilder_ButtonContentProps1680783343 = new SharedBuilder_ButtonContentProps1680783343(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Group {
    
    @JSImport("semantic-ui-react/dist/commonjs/elements/Button/Button", "default.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_ButtonGroupProps_158814638 = new SharedBuilder_ButtonGroupProps_158814638(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ButtonGroupProps): SharedBuilder_ButtonGroupProps_158814638 = new SharedBuilder_ButtonGroupProps_158814638(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Or {
    
    @JSImport("semantic-ui-react/dist/commonjs/elements/Button/Button", "default.Or")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Or.type): SharedBuilder_ButtonOrProps_184214248 = new SharedBuilder_ButtonOrProps_184214248(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ButtonOrProps): SharedBuilder_ButtonOrProps_184214248 = new SharedBuilder_ButtonOrProps_184214248(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Button/Button", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def animated(value: Boolean | fade | vertical): this.type = set("animated", value.asInstanceOf[js.Any])
    
    inline def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `aria-atomic`(value: Boolean): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `aria-busy`(value: Boolean): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    inline def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    inline def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    inline def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    inline def `aria-disabled`(value: Boolean): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `aria-expanded`(value: Boolean): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `aria-grabbed`(value: Boolean): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `aria-hidden`(value: Boolean): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    inline def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    inline def `aria-modal`(value: Boolean): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    inline def `aria-multiline`(value: Boolean): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `aria-multiselectable`(value: Boolean): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    inline def `aria-orientation`(value: horizontal | typingsJapgolly.react.reactStrings.vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    inline def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    inline def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `aria-readonly`(value: Boolean): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `aria-relevant`(value: additions | (`additions text`) | all | removals | text): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `aria-required`(value: Boolean): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    inline def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `aria-selected`(value: Boolean): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    inline def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def attached(value: Boolean | left | right | top | bottom): this.type = set("attached", value.asInstanceOf[js.Any])
    
    inline def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    inline def basic(value: Boolean): this.type = set("basic", value.asInstanceOf[js.Any])
    
    inline def circular(value: Boolean): this.type = set("circular", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: SemanticCOLORS | facebook | (`google plus`) | vk | twitter | linkedin | instagram | youtube): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentEditable(value: Boolean): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value :_*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def floated(value: SemanticFLOATS): this.type = set("floated", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
    
    inline def formAction(value: String): this.type = set("formAction", value.asInstanceOf[js.Any])
    
    inline def formEncType(value: String): this.type = set("formEncType", value.asInstanceOf[js.Any])
    
    inline def formMethod(value: String): this.type = set("formMethod", value.asInstanceOf[js.Any])
    
    inline def formNoValidate(value: Boolean): this.type = set("formNoValidate", value.asInstanceOf[js.Any])
    
    inline def formTarget(value: String): this.type = set("formTarget", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def icon(
      value: Boolean | (SemanticShorthandItem[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconProps */ js.Any
        ])
    ): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconFunction3(
      value: (/* component */ ReactType[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconProps */ js.Any
        ], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconProps */ js.Any, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("icon", js.Any.fromFunction3(value))
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value :_*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inlist(value: js.Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    inline def inputMode(value: String): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    inline def label(
      value: SemanticShorthandItem[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ js.Any
        ]
    ): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelFunction3(
      value: (/* component */ ReactType[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ js.Any
        ], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ js.Any, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("label", js.Any.fromFunction3(value))
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelPosition(value: right | left): this.type = set("labelPosition", value.asInstanceOf[js.Any])
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value :_*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def negative(value: Boolean): this.type = set("negative", value.asInstanceOf[js.Any])
    
    inline def onAbort[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onAnimationEnd[F[_]: Sync](value: ReactAnimationEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onAnimationIteration[F[_]: Sync](value: ReactAnimationEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onAnimationStart[F[_]: Sync](value: ReactAnimationEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onAuxClick[F[_]: Sync](value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onBeforeInput[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onBlur[F[_]: Sync](value: ReactFocusEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onCanPlay[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onCanPlayThrough[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onChange[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onClick[F[_]: Sync](value: (/* event */ ReactMouseEventFrom[HTMLButtonElement], /* data */ ButtonProps) => F[Unit]): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLButtonElement], t1: /* data */ ButtonProps) => implicitly[Sync[F]].runSync(value(t0, t1))))
    
    inline def onCompositionEnd[F[_]: Sync](value: ReactCompositionEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onCompositionStart[F[_]: Sync](value: ReactCompositionEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onCompositionUpdate[F[_]: Sync](value: ReactCompositionEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onContextMenu[F[_]: Sync](value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onCopy[F[_]: Sync](value: ReactClipboardEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onCut[F[_]: Sync](value: ReactClipboardEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onDoubleClick[F[_]: Sync](value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onDrag[F[_]: Sync](value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onDragEnd[F[_]: Sync](value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onDragEnter[F[_]: Sync](value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onDragExit[F[_]: Sync](value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onDragLeave[F[_]: Sync](value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onDragOver[F[_]: Sync](value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onDragStart[F[_]: Sync](value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onDrop[F[_]: Sync](value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onDurationChange[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onEmptied[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onEncrypted[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onEnded[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onError[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onFocus[F[_]: Sync](value: ReactFocusEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onInput[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onInvalid[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onKeyDown[F[_]: Sync](value: ReactKeyboardEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onKeyPress[F[_]: Sync](value: ReactKeyboardEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onKeyUp[F[_]: Sync](value: ReactKeyboardEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onLoad[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onLoadStart[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onLoadedData[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onLoadedMetadata[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onMouseDown[F[_]: Sync](value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onMouseEnter[F[_]: Sync](value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onMouseLeave[F[_]: Sync](value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onMouseMove[F[_]: Sync](value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onMouseOut[F[_]: Sync](value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onMouseOver[F[_]: Sync](value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onMouseUp[F[_]: Sync](value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onPaste[F[_]: Sync](value: ReactClipboardEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onPause[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onPlay[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onPlaying[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onPointerCancel[F[_]: Sync](value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onPointerDown[F[_]: Sync](value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onPointerEnter[F[_]: Sync](value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onPointerLeave[F[_]: Sync](value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onPointerMove[F[_]: Sync](value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onPointerOut[F[_]: Sync](value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onPointerOver[F[_]: Sync](value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onPointerUp[F[_]: Sync](value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onProgress[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onRateChange[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onReset[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onScroll[F[_]: Sync](value: ReactUIEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onSeeked[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onSeeking[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onSelect[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onStalled[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onSubmit[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onSuspend[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onTimeUpdate[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onTouchCancel[F[_]: Sync](value: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onTouchEnd[F[_]: Sync](value: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onTouchMove[F[_]: Sync](value: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onTouchStart[F[_]: Sync](value: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onTransitionEnd[F[_]: Sync](value: ReactTransitionEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onVolumeChange[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onWaiting[F[_]: Sync](value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def onWheel[F[_]: Sync](value: ReactWheelEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element] => F[Unit]): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLButtonElement & org.scalajs.dom.raw.Element]) => implicitly[Sync[F]].runSync(value(t0))))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
    
    inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    inline def primary(value: Boolean): this.type = set("primary", value.asInstanceOf[js.Any])
    
    inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def secondary(value: Boolean): this.type = set("secondary", value.asInstanceOf[js.Any])
    
    inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    inline def size(value: SemanticSIZES): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def spellCheck(value: Boolean): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double | String): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def toggle(value: Boolean): this.type = set("toggle", value.asInstanceOf[js.Any])
    
    inline def `type`(value: submit | reset | button): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    inline def value(value: String | js.Array[String] | Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: String*): this.type = set("value", js.Array(value :_*))
    
    inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Button.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StrictButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

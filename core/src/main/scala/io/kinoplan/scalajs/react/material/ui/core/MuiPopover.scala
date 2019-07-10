package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.internal.Origin
import japgolly.scalajs.react.ReactEvent
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiPopover extends ReactBridgeComponent with MuiPopoverExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Popover")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: js.UndefOr[js.Function] = js.undefined,
    anchorEl: js.UndefOr[html.Element | js.Function1[html.Element, html.Element]] = js.undefined,
    anchorOrigin: js.UndefOr[Origin] = js.undefined,
    anchorPosition: js.UndefOr[js.Object] = js.undefined,
    anchorReference: js.UndefOr[AnchorReference.Value] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    container: OptComponentContainerType = js.undefined,
    elevation: js.UndefOr[Int] = js.undefined,
    getContentAnchorEl: js.UndefOr[html.Element | js.Function1[html.Element, html.Element]] = js.undefined,
    marginThreshold: js.UndefOr[Int] = js.undefined,
    ModalClasses: js.UndefOr[js.Object] = js.undefined,
    onClose: ReactHandler2[ReactEvent, String] = js.undefined,
    onEnter: Handler1[html.Element] = js.undefined,
    onEntered: Handler1[html.Element] = js.undefined,
    onEntering: Handler1[html.Element] = js.undefined,
    onExit: Handler1[html.Element] = js.undefined,
    onExited: Handler1[html.Element] = js.undefined,
    onExiting: Handler1[html.Element] = js.undefined,
    open: Boolean,
    PaperProps: js.UndefOr[js.Object] = js.undefined,
    transformOrigin: js.UndefOr[Origin] = js.undefined,
    TransitionComponent: OptComponentPropType = js.undefined,
    transitionDuration: js.UndefOr[Int | js.Object | TransitionDuration.Value] = js.undefined,
    TransitionProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto
}

trait MuiPopoverExtensions {
  object AnchorReference extends Enumeration {
    type Value = String

    val anchorEl = "anchorEl"
    val anchorPosition = "anchorPosition"
    val none = "none"
  }

  object TransitionDuration extends Enumeration {
    type Value = String

    val auto = "auto"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val paper = "paper"
  }
}

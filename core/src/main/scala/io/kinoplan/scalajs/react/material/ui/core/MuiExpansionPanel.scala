package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiExpansionPanel extends ReactBridgeComponent with MuiExpansionPanelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ExpansionPanel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    CollapseProps: js.UndefOr[js.Object] = js.undefined,
    defaultExpanded: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    component: OptComponentPropType = js.undefined,
    elevation: js.UndefOr[Int] = js.undefined,
    square: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto
}

trait MuiExpansionPanelExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val rounded = "rounded"
    val expanded = "expanded"
    val disabled = "disabled"
  }
}

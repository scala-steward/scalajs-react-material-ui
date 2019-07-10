package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import io.kinoplan.scalajs.react.material.ui.html.ReactEventFromNumberInput
import japgolly.scalajs.react.ReactEvent
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiTablePagination extends ReactBridgeComponent with MuiTablePaginationExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "TablePagination")
  @js.native
  object RawComponent extends js.Function

  def apply(
    ActionsComponent: OptComponentPropType = js.undefined,
    backIconButtonProps: js.UndefOr[js.Object] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: OptComponentPropType = js.undefined,
    count: Int,
    labelDisplayedRows: js.UndefOr[js.Function] = js.undefined,
    labelRowsPerPage: js.UndefOr[VdomNode] = js.undefined,
    nextIconButtonProps: js.UndefOr[js.Object] = js.undefined,
    onChangePage: ReactHandler2[ReactEvent, Int] = js.undefined,
    onChangeRowsPerPage: ReactHandler1[ReactEventFromNumberInput] = js.undefined,
    page: Int,
    rowsPerPage: Int,
    rowsPerPageOptions: js.UndefOr[js.Array[Int]] = js.undefined,
    SelectProps: js.UndefOr[js.Object] = js.undefined,
    align: js.UndefOr[Alignment.Value] = js.undefined,
    padding: js.UndefOr[Padding.Value] = js.undefined,
    scope: js.UndefOr[String] = js.undefined,
    sortDirection: js.UndefOr[Boolean | SortDirection.Value] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiTablePaginationExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val toolbar = "toolbar"
    val spacer = "spacer"
    val caption = "caption"
    val selectRoot = "selectRoot"
    val select = "select"
    val selectIcon = "selectIcon"
    val input = "input"
    val menuItem = "menuItem"
    val actions = "actions"
    val head = "head"
    val body = "body"
    val footer = "footer"
    val numeric	= "numeric"
    val paddingDense = "paddingDense"
    val paddingCheckbox = "paddingCheckbox"
    val paddingNone = "paddingNone"
    val alignLeft = "alignLeft"
    val alignCenter = "alignCenter"
    val alignRight = "alignRight"
    val alignJustify = "alignJustify"
  }

  object Alignment extends Enumeration {
    type Value = String

    val inherit = "inherit"
    val left = "left"
    val center = "center"
    val right = "right"
    val justify = "justify"
  }

  object Padding extends Enumeration {
    type Value = String

    val default = "default"
    val checkbox = "checkbox"
    val dense = "dense"
    val none = "none"
  }

  object SortDirection extends Enumeration {
    type Value = String

    val asc = "asc"
    val desc = "desc"
  }

  object Variant extends Enumeration {
    type Value = String

    val head = "head"
    val body = "body"
    val footer = "footer"
  }
}

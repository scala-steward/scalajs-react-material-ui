package io.kinoplan.demo.components.demos.Menus

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Menus.{DefaultMenuStyle, MenuStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiList, MuiListItem, MuiListItemText, MuiMenu, MuiMenuItem}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ReactEventFromHtml, ScalaComponent}
import org.scalajs.dom.raw.HTMLElement
import scalacss.ScalaCssReactImplicits

object SimpleListMenu extends ScalaCssReactImplicits {
  case class Props(style: MenuStyle)

  case class State(anchorEl: Option[HTMLElement] = None, selectedIndex: Int = 1) {
    val isMenuOpen = anchorEl.nonEmpty

    def handleClickListItem(value: HTMLElement) = copy(anchorEl = Some(value))

    def handleMenuItemClick(index: Int) = copy(selectedIndex = index, anchorEl = None)

    def handleClose = copy(anchorEl = None)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleClickListItem(e: ReactEventFromHtml): Callback = {
      val target = e.currentTarget

      t.modState(_.handleClickListItem(target))
    }

    def handleMenuItemClick(index: Int): Callback = {
      t.modState(_.handleMenuItemClick(index))
    }

    def handleClose: ReactEvent => Callback = _ => {
      t.modState(_.handleClose)
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val options = List(
        "Show some love to Material-UI",
        "Show all notification content",
        "Hide sensitive notification content",
        "Hide all notification content"
      )

      div(
        ComponentContainer("Selected menus")(
          div(css.root,
            MuiList(component = "nav")(
              MuiListItem(button = true)(
                aria.hasPopup := "true",
                aria.controls := "lock-menu",
                aria.label := "When device is locked",
                onClick ==> handleClickListItem,
                MuiListItemText(
                  primary = Some("When device is locked"),
                  secondary = Some(options(state.selectedIndex))
                )
              )
            ),
            MuiMenu(anchorEl = state.anchorEl, open = state.isMenuOpen, onClose = Some(handleClose))(
              id := "lock-menu",
              options.zipWithIndex.toVdomArray { case (option, index) =>
                MuiMenuItem()(
                  Attr("key") := option,
                  disabled := index == 0,
                  selected := index == state.selectedIndex,
                  onClick --> handleMenuItemClick(index),
                  option
                )
              }
            ).when(state.isMenuOpen)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleListMenu")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: MenuStyle = DefaultMenuStyle) = component(Props(style))
}

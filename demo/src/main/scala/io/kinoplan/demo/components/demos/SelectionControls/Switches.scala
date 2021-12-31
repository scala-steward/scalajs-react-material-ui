package io.kinoplan.demo.components.demos.SelectionControls

import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core.MuiSwitch

object Switches extends ScalaCssReactImplicits {

  case class State(
    checkedA: Boolean = true,
    checkedB: Boolean = true
  ) {
    def handleChangeCheckedA(value: Boolean) = copy(checkedA = value)

    def handleChangeCheckedB(value: Boolean) = copy(checkedB = value)
  }

  class Backend(t: BackendScope[Unit, State]) {

    def handleChangeCheckedA(e: ReactEventFromInput) = {
      val value = e.target.checked

      t.modState(_.handleChangeCheckedA(value))
    }

    def handleChangeCheckedB(e: ReactEventFromInput) = {
      val value = e.target.checked

      t.modState(_.handleChangeCheckedB(value))
    }

    def render(state: State): VdomElement = div(
      ComponentContainer("Switches")(
        MuiSwitch()(
          checked := state.checkedA,
          onChange ==> handleChangeCheckedA,
          value := "checkedA"
        ),
        MuiSwitch(color = MuiSwitch.Color.primary)(
          checked := state.checkedB,
          onChange ==> handleChangeCheckedB,
          value := "checkedB"
        ),
        MuiSwitch()(value := "checkedC"),
        MuiSwitch()(disabled := true, value := "checkedD"),
        MuiSwitch()(disabled := true, checked := true, value := "checkedE"),
        MuiSwitch(defaultChecked = true, color = MuiSwitch.Color.default)(value := "checkedF")
      )
    )

  }

  private val component = ScalaComponent.builder[Unit]("Switches")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply() = component()
}

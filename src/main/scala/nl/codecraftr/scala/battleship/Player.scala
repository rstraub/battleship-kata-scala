package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.grid.Grid

case class Player(ships: Set[Ship], grid: Grid) {
  def fleetSunk: Boolean = ships.nonEmpty && ships.forall(_.isSunk)
}

object Player {
  def create(): Player = Player(
    Set(),
    Grid.create()
  )
}

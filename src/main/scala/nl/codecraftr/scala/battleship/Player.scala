package nl.codecraftr.scala.battleship

case class Player(ships: Set[Ship], grid: Grid) {
  def fleetSunk: Boolean = ships.nonEmpty && ships.forall(_.isSunk)
}

object Player {
  def create(): Player = Player(
    Set(),
    Grid.create()
  )
}

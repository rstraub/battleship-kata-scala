package nl.codecraftr.scala.battleship

case class Player(ships: Set[Ship], grid: Grid) {
  def arrange(ship: Ship): Player =
    copy(ships = this.ships + ship)

  def fleetSunk: Boolean = ships.nonEmpty && ships.forall(_.isSunk)
}

object Player {
  def create(): Player = Player(
    Set(), Grid.create()
  )
}

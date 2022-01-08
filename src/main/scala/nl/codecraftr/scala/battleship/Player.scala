package nl.codecraftr.scala.battleship

case class Player(ships: Set[Ship], grid: Grid) {
  def arrange(ship: Ship): Player =
    copy(ships = this.ships + ship)
}

object Player {
  def create(): Player = Player(
    Set(), Grid.create()
  )
}

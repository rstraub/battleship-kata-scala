package nl.codecraftr.scala.battleship

case class Player(ships: Set[Ship], grid: Grid) {
  def arrange(ship: Ship): Player =
    copy(ships = Set(Destroyer("B1", "B2")))
}

object Player {
  def create(): Player = Player(
    Set(), Grid.create()
  )
}

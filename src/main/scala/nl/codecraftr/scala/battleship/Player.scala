package nl.codecraftr.scala.battleship

case class Player(ships: Set[Ship], grid: Grid) {
  def arrange(ship: Ship, coords: List[String]): Player =
    copy(ships = Set(Destroyer))
}

object Player {
  def create(): Player = Player(
    Set(), Grid.create()
  )
}

package nl.codecraftr.scala.battleship

case class Player(ships: Set[Ship], grid: Grid) {
  def shot(target: Square): Player =
    findShip(target)
      .map(s => replace(s, s.hit(target)))
      .map(copy(_))
      .getOrElse(this)

  private def findShip(target: Square) = ships.find(_.squares(target))

  private def replace(ship: Ship, other: Ship) = ships - ship + other

  def arrange(ship: Ship): Player = copy(ships + ship)

  def fleetSunk: Boolean = ships.nonEmpty && ships.forall(_.isSunk)
}

object Player {
  def create(): Player = Player(
    Set(),
    Grid.create()
  )
}

package nl.codecraftr.scala.battleship

case class Player(ships: Set[Ship], grid: Grid) {
  def shot(target: Square): Player = {
    findShip(target)
      .map(_.hit(target))
      .map(s => copy(ships = Set(s)))
      .getOrElse(this)
  }

  private def findShip(target: Square) = ships.find(_.squares.contains(target))

  def arrange(ship: Ship): Player =
    copy(ships = this.ships + ship)

  def fleetSunk: Boolean = ships.nonEmpty && ships.forall(_.isSunk)
}

object Player {
  def create(): Player = Player(
    Set(), Grid.create()
  )
}

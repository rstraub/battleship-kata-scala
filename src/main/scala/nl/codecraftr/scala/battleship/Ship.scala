package nl.codecraftr.scala.battleship

case class Ship(occupies: Int, hits: Int = 0) {
  def shoot(): Option[Ship] =
    if (hits < occupies) Some(copy(hits = hits + 1))
    else None

  final def isSunk: Boolean = hits == occupies
}

object Ship {
  def destroyer(): Ship = Ship(2)
  def submarine(): Ship = Ship(3)
  def cruiser(): Ship = Ship(3)
  def battleship(): Ship = Ship(4)
  def aircraftCarrier(): Ship = Ship(5)
}

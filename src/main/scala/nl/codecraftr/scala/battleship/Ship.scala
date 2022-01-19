package nl.codecraftr.scala.battleship

sealed abstract class Ship(val occupies: Int, val hits: Int) {
  def hit(): Ship = this

  final def isSunk: Boolean = hits == occupies
}

case class Destroyer(override val hits: Int = 0)
    extends Ship(occupies = 2, hits)

case class Submarine(override val hits: Int = 0)
    extends Ship(occupies = 3, hits)

case class Cruiser(override val hits: Int = 0) extends Ship(occupies = 3, hits)

case class Battleship(override val hits: Int = 0)
    extends Ship(occupies = 4, hits)

case class AircraftCarrier(override val hits: Int = 0)
    extends Ship(occupies = 5, hits)

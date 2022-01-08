package nl.codecraftr.scala.battleship

sealed trait Ship

case object AircraftCarrier extends Ship

case object Battleship extends Ship

case class Submarine(square1: Square, square2: Square, square3: Square) extends Ship

case object Cruiser extends Ship

case class Destroyer(square1: Square, square2: Square) extends Ship {
  def squares: Set[Square] = Set(square1, square2)
}

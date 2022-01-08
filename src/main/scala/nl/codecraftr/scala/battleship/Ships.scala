package nl.codecraftr.scala.battleship

sealed trait Ship

case object AircraftCarrier extends Ship

case object Battleship extends Ship

case class Submarine(square1: String, square2: String, square3: String) extends Ship

case object Cruiser extends Ship

case class Destroyer(square1: String, square2: String) extends Ship {
  def squares: Set[String] = Set(square1, square2)
}

package nl.codecraftr.scala.battleship

sealed trait Ship {
  val squares: Set[Square]
  val hits: Set[Square]

  def hit(square: Square): Ship

  def isSunk: Boolean = hits == squares
}

private case class ShipCons(squares: Set[Square], hits: Set[Square] = Set()) extends Ship {
  def hit(square: Square): Ship = copy(hits = this.hits + square)
}

object Ship {
  def aircraftCarrier(square1: Square, square2: Square, square3: Square, square4: Square, square5: Square): Ship =
    ShipCons(Set(square1, square2, square3, square4, square5))

  def battleship(square1: Square, square2: Square, square3: Square, square4: Square): Ship =
    ShipCons(Set(square1, square2, square3, square4))

  def submarine(square1: Square, square2: Square, square3: Square): Ship =
    ShipCons(Set(square1, square2, square3))

  def cruiser(square1: Square, square2: Square, square3: Square): Ship =
    ShipCons(Set(square1, square2, square3))

  def destroyer(square1: Square, square2: Square): Ship =
    ShipCons(Set(square1, square2))
}

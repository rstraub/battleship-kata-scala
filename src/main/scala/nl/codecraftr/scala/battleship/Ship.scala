package nl.codecraftr.scala.battleship

case class Ship(squares: Set[Square]) {
  val hits: Set[Square] = Set()

  def hit(square: Square): Ship = this
}

object Ship {
  def aircraftCarrier(square1: Square, square2: Square, square3: Square, square4: Square, square5: Square): Ship =
    Ship(Set(square1, square2, square3, square4, square5))

  def battleship(square1: Square, square2: Square, square3: Square, square4: Square): Ship =
    Ship(Set(square1, square2, square3, square4))

  def submarine(square1: Square, square2: Square, square3: Square): Ship =
    Ship(Set(square1, square2, square3))

  def cruiser(square1: Square, square2: Square, square3: Square): Ship =
    Ship(Set(square1, square2, square3))

  def destroyer(square1: Square, square2: Square): Ship =
    Ship(Set(square1, square2))
}

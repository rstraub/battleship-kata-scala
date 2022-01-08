package nl.codecraftr.scala.battleship

sealed trait Ship {
  def squares: Set[Square]
}

case class AircraftCarrier(square1: Square, square2: Square, square3: Square, square4: Square, square5: Square) extends Ship {
  override def squares: Set[Square] = Set(square1, square2, square3, square4, square5)
}

case class Battleship(square1: Square, square2: Square, square3: Square, square4: Square) extends Ship {
  override def squares: Set[Square] = Set(square1, square2, square3, square4)
}

case class Submarine(square1: Square, square2: Square, square3: Square) extends Ship {
  override def squares: Set[Square] = Set(square1, square2, square3)
}

case class Cruiser(square1: Square, square2: Square, square3: Square) extends Ship {
  override def squares: Set[Square] = Set(square1, square2, square3)
}

case class Destroyer(square1: Square, square2: Square) extends Ship {
  override def squares: Set[Square] = Set(square1, square2)
}

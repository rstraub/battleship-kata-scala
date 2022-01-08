package nl.codecraftr.scala.battleship

sealed trait Ship {
  def squares: Set[Square]
}

case object AircraftCarrier extends Ship {
  override def squares: Set[Square] = ???
}

case object Battleship extends Ship {
  override def squares: Set[Square] = ???
}

case class Submarine(square1: Square, square2: Square, square3: Square) extends Ship {
  override def squares: Set[Square] = Set(square1, square2, square3)
}

case object Cruiser extends Ship {
  override def squares: Set[Square] = ???
}

case class Destroyer(square1: Square, square2: Square) extends Ship {
  override def squares: Set[Square] = Set(square1, square2)
}

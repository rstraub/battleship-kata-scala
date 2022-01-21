package nl.codecraftr.scala.battleship.grid

case class Grid(squares: Set[Square]) {
  def place(placement: Placement): Option[Grid] = {
    val ship = placement.ship
    val coordinates = placement.coordinates
    val toReplace: Set[Square] = coordinates.flatMap(findBy)
    val newSquares: Set[Square] = toReplace.flatMap(_.place(ship))
    val updated: Set[Square] = squares -- toReplace ++ newSquares
    Some(copy(squares = updated))
  }

  private def findBy(coordinate: Coordinate): Option[Square] =
    squares.find(_.equalTo(coordinate))
}

object Grid {
  def create(): Grid = Grid(emptySquares().toSet)

  private def emptySquares() = for {
    c <- Columns.values.toList
    r <- Rows.values.toList
  } yield EmptySquare(c, r)
}

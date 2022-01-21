package nl.codecraftr.scala.battleship.grid

case class Point(x: Int, y: Int)

case class Grid(squares: Set[Square]) {
  def place(placement: Placement): Option[Grid] = {
    val Placement(ship, coordinates) = placement
    val toReplace: Set[Square] = coordinates.flatMap(findBy)
    val newSquares: Set[Square] = toReplace.flatMap(_.place(ship))
    val updated: Set[Square] = squares -- toReplace ++ newSquares
    Some(copy(squares = updated))
  }

  private def findBy(coordinate: Coordinate): Option[Square] =
    squares.find(_.equalTo(coordinate))

  def shoot(target: Target): Option[Grid] = {
    val toReplace: Option[Square] =
      findBy(target)
    val newSquare: Option[Square] = toReplace.flatMap(_.shoot())
    val both: Option[(Square, Square)] = toReplace.zip(newSquare)
    both.map(both => replace(both._1, both._2))
  }

  private def replace(orig: Square, using: Square): Grid =
    replace(Set(orig), Set(using))
  private def replace(orig: Set[Square], using: Set[Square]): Grid = {
    val updated = squares -- orig ++ using
    copy(squares = updated)
  }

  def misses: Set[MissedSquare] = squares.collect { case s: MissedSquare => s }

  def hits: Set[HitSquare] = squares.collect { case s: HitSquare => s }
}

object Grid {
  def create(): Grid = Grid(emptySquares().toSet)

  private def emptySquares() = for {
    c <- Columns.values.toList
    r <- Rows.values.toList
  } yield EmptySquare(c, r)
}

package nl.codecraftr.scala.battleship

case class Grid(squares: Set[Square], shots: Set[Square] = Set()) {
  def shot(target: Square): Option[Grid] =
    if (shots(target))
      None
    else
      Some(copy(shots = this.shots + target))
}

object Grid {
  def create(): Grid = Grid(allSquares().toSet)

  private def allSquares() = for {
    c <- Columns.values.toList
    r <- Rows.values.toList
  } yield EmptySquare(c, r)
}

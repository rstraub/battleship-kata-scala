package nl.codecraftr.scala.battleship

case class Grid(squares: Set[Square], shots: Set[Square] = Set()) {
  def shot(target: Square): Either[String, Grid] =
    if (shots(target))
      Left(s"Square $target was already shot")
    else
      Right(copy(shots = this.shots + target))
}

object Grid {
  def create(): Grid = Grid(allSquares().toSet)

  private def allSquares() = for {
    c <- Columns.values.toList
    r <- Rows.values.toList
  } yield Square(c, r)
}

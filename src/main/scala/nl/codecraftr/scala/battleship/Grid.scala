package nl.codecraftr.scala.battleship

case class Grid(squares: Set[Square], shots: Set[Square] = Set()) {
  def shot(target: Square): Grid = copy(shots = this.shots + target)
}

object Grid {
  def create(): Grid = Grid(allSquares().toSet)

  private def allSquares() = for {
    c <- Columns.values.toList
    r <- Rows.values.toList
  } yield Square(c, r)
}

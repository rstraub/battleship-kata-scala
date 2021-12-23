package nl.codecraftr.scala.battleship

case class Grid(squares: Set[Square])

object Grid {
  def create(): Grid = Grid(allSquares().toSet)

  private def allSquares() = for {
    c <- Columns.values.toList
    r <- Rows.values.toList
  } yield Square(r, c)
}

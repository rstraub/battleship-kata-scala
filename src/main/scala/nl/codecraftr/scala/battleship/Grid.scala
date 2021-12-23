package nl.codecraftr.scala.battleship

case class Grid(squares: Set[Square])

object Grid {
  def create(): Grid = Grid(allSquares().toSet)

  private def allSquares() = for {
    c <- Columns.values.toList
    r <- 1 until 11
  } yield Square(r, c)
}

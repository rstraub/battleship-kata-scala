package nl.codecraftr.scala.battleship

case class Grid(squares: List[List[Any]])

object Grid {
  def create(): Grid = Grid(
    List.fill(10)(List.fill(10)(""))
  )
}

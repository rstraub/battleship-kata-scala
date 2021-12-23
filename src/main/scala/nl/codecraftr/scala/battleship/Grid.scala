package nl.codecraftr.scala.battleship

case class Grid(squares: List[List[Any]])

object Grid {
  private val xAxis = List("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")

  def create(): Grid = Grid(
    List.fill(10)(xAxis)
  )
}

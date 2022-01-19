package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.squares.Columns.Column
import nl.codecraftr.scala.battleship.squares.Rows.Row
import nl.codecraftr.scala.battleship.squares._

case class Grid(squares: Set[Square]) {
  def place(ship: Ship, coordinates: Set[(Column, Row)]): Option[Grid] = {
    None
  }
}

object Grid {
  def create(): Grid = Grid(allSquares().toSet)

  private def allSquares() = for {
    c <- Columns.values.toList
    r <- Rows.values.toList
  } yield EmptySquare(c, r)
}

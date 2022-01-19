package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.grid.Columns.Column
import nl.codecraftr.scala.battleship.grid.Rows.Row

trait Coordinate {
  val column: Column
  val row: Row

  def equalTo(other: Coordinate): Boolean =
    column == other.column && row == other.row
}

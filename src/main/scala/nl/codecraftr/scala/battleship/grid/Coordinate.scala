package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.grid.Columns.Column
import nl.codecraftr.scala.battleship.grid.Rows.Row

case class Coordinate(
    column: Column,
    row: Row
) {
  override def toString: String = s"$column${row.id}"
}

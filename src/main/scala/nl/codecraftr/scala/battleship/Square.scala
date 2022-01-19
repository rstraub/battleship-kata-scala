package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.Column
import nl.codecraftr.scala.battleship.Rows.Row

case class Square(column: Column, row: Row) {
  override def toString: String = s"$column${row.id}"
}

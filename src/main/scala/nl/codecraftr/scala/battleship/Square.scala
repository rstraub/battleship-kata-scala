package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.Column
import nl.codecraftr.scala.battleship.Rows.Row

object Columns extends Enumeration {
  type Column = Value

  val A, B, C, D, E, F, G, H, I, J = Value
}

case class Square(column: Column, row: Row) {
  override def toString: String = s"$column${row.id}"
}

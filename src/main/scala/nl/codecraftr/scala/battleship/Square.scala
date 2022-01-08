package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.Column
import nl.codecraftr.scala.battleship.Rows.Row

object Columns extends Enumeration {
  type Column = Value

  val A, B, C, D, E, F, G, H, I, J = Value
}

object Rows extends Enumeration {
  type Row = Value

  val ONE = Value(1)
  val TWO = Value(2)
  val THREE = Value(3)
  val FOUR = Value(4)
  val FIVE = Value(5)
  val SIX = Value(6)
  val SEVEN = Value(7)
  val EIGHT = Value(8)
  val NINE = Value(9)
  val TEN = Value(10)
}

case class Square(column: Column, row: Row) {
  override def toString: String = s"$column${row.id}"
}

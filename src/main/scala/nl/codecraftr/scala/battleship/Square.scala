package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.Column
import nl.codecraftr.scala.battleship.Rows.Row

object Columns extends Enumeration {
  type Column = Value

  val A, B, C, D, E, F, G, H, I, J = Value
}

object Rows extends Enumeration {
  type Row = Value

  val ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN = Value
}

case class Square(row: Row, column: Column)

package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.Column

object Columns extends Enumeration {
  type Column = Value

  val A, B, C, D, E, F, G, H, I, J = Value
}

case class Square(row: Int, column: Column)

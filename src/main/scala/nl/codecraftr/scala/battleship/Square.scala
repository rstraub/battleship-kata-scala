package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.Column
import nl.codecraftr.scala.battleship.Rows.Row

trait Square {
  val column: Column
  val row: Row

  override def toString: String = s"$column${row.id}"
}

case class EmptySquare(override val column: Column, override val row: Row)
    extends Square

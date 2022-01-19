package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.Column
import nl.codecraftr.scala.battleship.Rows.Row

trait Square {
  val column: Column
  val row: Row

  def place(ship: Ship): Option[Square] = None

  def shoot(): Option[Square]

  override def toString: String = s"$column${row.id}"
}

package nl.codecraftr.scala.battleship.squares

import nl.codecraftr.scala.battleship.Columns.Column
import nl.codecraftr.scala.battleship.Rows.Row
import nl.codecraftr.scala.battleship.Ship

trait Square {
  val column: Column
  val row: Row

  def place(ship: Ship): Option[Square] = None

  def shoot(): Option[Square]

  override def toString: String = s"$column${row.id}"
}

package nl.codecraftr.scala.battleship.squares

import nl.codecraftr.scala.battleship.Ship
import nl.codecraftr.scala.battleship.squares.Columns.Column
import nl.codecraftr.scala.battleship.squares.Rows.Row

trait Square {
  val column: Column
  val row: Row

  def place(ship: Ship): Option[Square] = None

  def shoot(): Option[Square]

  override def toString: String = s"$column${row.id}"
}

package nl.codecraftr.scala.battleship.squares

import nl.codecraftr.scala.battleship.Columns.Column
import nl.codecraftr.scala.battleship.Rows.Row
import nl.codecraftr.scala.battleship.Ship

case class EmptySquare(override val column: Column, override val row: Row)
    extends Square {
  override def place(ship: Ship): Option[Square] =
    Some(OccupiedSquare(column, row, ship))

  override def shoot(): Option[Square] = Some(MissedSquare(column, row))
}

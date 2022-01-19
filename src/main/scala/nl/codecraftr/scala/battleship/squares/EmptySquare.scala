package nl.codecraftr.scala.battleship.squares

import nl.codecraftr.scala.battleship.Ship
import nl.codecraftr.scala.battleship.squares.Columns.Column
import nl.codecraftr.scala.battleship.squares.Rows.Row

case class EmptySquare(override val column: Column, override val row: Row)
    extends Square {
  override def place(ship: Ship): Option[Square] =
    Some(OccupiedSquare(column, row, ship))

  override def shoot(): Option[Square] = Some(MissedSquare(column, row))
}

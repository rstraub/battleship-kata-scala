package nl.codecraftr.scala.battleship.squares

import nl.codecraftr.scala.battleship.Ship
import nl.codecraftr.scala.battleship.squares.Columns.Column
import nl.codecraftr.scala.battleship.squares.Rows.Row

case class OccupiedSquare(
    override val column: Column,
    override val row: Row,
    ship: Ship
) extends Square {
  override def shoot(): Option[Square] = Some(HitSquare(column, row, ship))
}

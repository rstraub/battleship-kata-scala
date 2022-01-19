package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.Column
import nl.codecraftr.scala.battleship.Rows.Row

case class OccupiedSquare(
    override val column: Column,
    override val row: Row,
    ship: Ship
) extends Square {
  override def shoot(): Option[Square] = Some(HitSquare(column, row, ship))
}

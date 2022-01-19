package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.Ship
import nl.codecraftr.scala.battleship.grid.Columns.Column
import nl.codecraftr.scala.battleship.grid.Rows.Row

sealed trait Square extends Coordinate {
  def place(ship: Ship): Option[Square] = None

  def shoot(): Option[Square]

  override def toString: String = s"$column${row.id}"
}

trait ShotSquare extends Square {
  override def shoot(): Option[Square] = None
}

case class EmptySquare(override val column: Column, override val row: Row)
    extends Square {
  override def place(ship: Ship): Option[Square] =
    Some(OccupiedSquare(column, row, ship))

  override def shoot(): Option[Square] = Some(MissedSquare(column, row))
}

case class MissedSquare(override val column: Column, override val row: Row)
    extends ShotSquare

case class OccupiedSquare(
    override val column: Column,
    override val row: Row,
    ship: Ship
) extends Square {
  override def shoot(): Option[Square] = Some(HitSquare(column, row, ship))
}

case class HitSquare(
    override val column: Column,
    override val row: Row,
    ship: Ship
) extends ShotSquare

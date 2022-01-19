package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.Column
import nl.codecraftr.scala.battleship.Rows.Row

trait Square {
  val column: Column
  val row: Row

  def place(ship: Ship): Option[Square]

  def shoot(): Option[Square]

  override def toString: String = s"$column${row.id}"
}

case class EmptySquare(override val column: Column, override val row: Row)
    extends Square {
  override def place(ship: Ship): Option[Square] =
    Some(OccupiedSquare(column, row, ship))

  override def shoot(): Option[Square] = Some(MissedSquare(column, row))
}

case class OccupiedSquare(
    override val column: Column,
    override val row: Row,
    ship: Ship
) extends Square {
  override def place(ship: Ship): Option[Square] = None

  override def shoot(): Option[Square] = Some(HitSquare(column, row, ship))
}

case class MissedSquare(override val column: Column, override val row: Row)
    extends Square {
  override def place(ship: Ship): Option[Square] = None

  override def shoot(): Option[Square] = ???
}

case class HitSquare(
    override val column: Column,
    override val row: Row,
    ship: Ship
) extends Square {
  override def place(ship: Ship): Option[Square] = ???

  override def shoot(): Option[Square] = ???
}

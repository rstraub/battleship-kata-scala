package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.Ship
import nl.codecraftr.scala.battleship.grid.Columns.Column
import nl.codecraftr.scala.battleship.grid.Rows.Row

sealed trait Square extends Coordinate {
  val ship: Option[Ship]

  def place(ship: Ship): Option[Square] = None

  def shoot(): Option[Square]

  override def toString: String = s"$column${row.id}"
}

private case class SquareCons(
    override val column: Column,
    override val row: Row,
    override val ship: Option[Ship] = None
) extends Square {
  override def shoot(): Option[Square] = ???
}

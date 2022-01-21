package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.Ship
import nl.codecraftr.scala.battleship.grid.Columns.Column
import nl.codecraftr.scala.battleship.grid.Rows.Row

sealed trait Square extends Coordinate {
  val ship: Option[Ship]
  val shot: Boolean

  def place(ship: Ship): Option[Square]

  def shoot(): Option[Square]

  def hit: Boolean = shot && isOccupied

  def isOccupied: Boolean = !isEmpty

  def miss: Boolean = shot && isEmpty

  def isEmpty: Boolean = ship.isEmpty

  override def toString: String = s"$column${row.id}"
}

object Square {
  def emptySquare(column: Column, row: Row): Square =
    SquareCons(column, row)

  private case class SquareCons(
      override val column: Column,
      override val row: Row,
      override val ship: Option[Ship] = None,
      override val shot: Boolean = false
  ) extends Square {
    def shoot(): Option[Square] =
      if (shot) None
      else if (isOccupied) Some(copy(shot = true, ship = this.ship.get.shoot))
      else Some(copy(shot = true))

    def place(ship: Ship): Option[Square] =
      if (isOccupied || shot) None
      else Some(copy(ship = Some(ship)))
  }
}

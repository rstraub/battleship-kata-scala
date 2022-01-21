package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.Ship
import nl.codecraftr.scala.battleship.grid.Columns.Column
import nl.codecraftr.scala.battleship.grid.Rows.Row

sealed trait Square {
  val coordinate: Coordinate
  val ship: Option[Ship]
  val shot: Boolean

  def place(ship: Ship): Option[Square]

  def shoot(): Option[Square]

  def hit: Boolean = shot && isOccupied

  def isOccupied: Boolean = !isEmpty

  def miss: Boolean = shot && isEmpty

  def isEmpty: Boolean = ship.isEmpty
}

object Square {
  def apply(column: Column, row: Row): Square =
    SquareCons(Coordinate(column, row))

  private case class SquareCons(
      override val coordinate: Coordinate,
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

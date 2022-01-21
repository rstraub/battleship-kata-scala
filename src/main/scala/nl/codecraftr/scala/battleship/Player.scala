package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Statuses.{PLACING, Status}
import nl.codecraftr.scala.battleship.grid.{Coordinate, Grid, Placement}

object Statuses extends Enumeration {
  type Status = Value

  val PLACING: Statuses.Value = Value
}

case class Player(grid: Grid) {
  def status: Status = PLACING

  def place(placement: Placement): Option[Player] =
    grid.place(placement).map(copy)

  def shoot(target: Coordinate): Option[Player] = grid.shoot(target).map(copy)

  def allSunk: Boolean = ships.nonEmpty && ships.forall(_.isSunk)

  private def ships = grid.ships
}

object Player {
  def create(): Player = Player(Grid.create())
}

package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.grid.{Coordinate, Grid, Placement}

case class Player(grid: Grid) {
  def place(placement: Placement): Option[Player] =
    grid.place(placement).map(copy)

  def shoot(target: Coordinate): Option[Player] = grid.shoot(target).map(copy)

  def allSunk: Boolean = ships.nonEmpty && ships.forall(_.isSunk)

  private def ships = grid.ships
}

object Player {
  def create(): Player = Player(Grid.create())
}

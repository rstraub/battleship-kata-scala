package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.grid.{Grid, Placement}

case class Player(grid: Grid) {
  def place(placement: Placement): Option[Player] =
    grid.place(placement).map(g => copy(grid = g))

  def ships: Set[Ship] = Set()
}

object Player {
  def create(): Player = Player(Grid.create())
}

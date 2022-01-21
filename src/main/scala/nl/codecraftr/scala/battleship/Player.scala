package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.grid.Grid

case class Player(grid: Grid)

object Player {
  def create(): Player = Player(Grid.create())
}

package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.grid.PlacementTdb.aPlacement

object GridTdb {
  def aGrid: Grid = Grid.create()

  def aGridWithShip: Grid = Grid.create().place(aPlacement).get
}

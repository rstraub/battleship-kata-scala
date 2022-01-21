package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.ShipTdb.aShip
import nl.codecraftr.scala.battleship.grid.Columns.A
import nl.codecraftr.scala.battleship.grid.Rows.{ONE, THREE, TWO}

object PlacementTdb {
  def aPlacement: Placement =
    Placement(
      aShip,
      Coordinate(A, ONE),
      Coordinate(A, TWO),
      Coordinate(A, THREE)
    )
}

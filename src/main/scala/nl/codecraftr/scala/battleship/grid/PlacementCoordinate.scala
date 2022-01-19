package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.grid.Columns.Column
import nl.codecraftr.scala.battleship.grid.Rows.Row

case class PlacementCoordinate(
    override val column: Column,
    override val row: Row
) extends Coordinate

package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.ShipTdb.aShip
import nl.codecraftr.scala.battleship.grid
import nl.codecraftr.scala.battleship.grid.ColumnsTdb.aColumn
import nl.codecraftr.scala.battleship.grid.RowsTdb.aRow

object SquareTdb {
  def anEmptySquare: EmptySquare = grid.EmptySquare(aColumn, aRow)
  def aMissedSquare: MissedSquare = grid.MissedSquare(aColumn, aRow)
  def anOccupiedSquare: OccupiedSquare =
    grid.OccupiedSquare(aColumn, aRow, aShip)
  def aHitSquare: HitSquare = grid.HitSquare(aColumn, aRow, aShip)
}

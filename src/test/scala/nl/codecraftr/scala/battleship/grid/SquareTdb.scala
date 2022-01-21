package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.ShipTdb.aShip
import nl.codecraftr.scala.battleship.grid.ColumnsTdb.aColumn
import nl.codecraftr.scala.battleship.grid.RowsTdb.aRow

object SquareTdb {
  def anEmptySquare: EmptySquare = EmptySquare(aColumn, aRow)

  def aMissedSquare: MissedSquare = MissedSquare(aColumn, aRow)

  def anOccupiedSquare: OccupiedSquare =
    OccupiedSquare(aColumn, aRow, aShip)

  def aHitSquare: HitSquare = HitSquare(aColumn, aRow, aShip)
}

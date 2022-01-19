package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.ColumnsTdb.aColumn
import nl.codecraftr.scala.battleship.RowsTdb.aRow
import nl.codecraftr.scala.battleship.ShipTdb.aShip

object SquareTdb {
  def anEmptySquare: EmptySquare = EmptySquare(aColumn, aRow)
  def aMissedSquare: MissedSquare = MissedSquare(aColumn, aRow)
  def anOccupiedSquare: OccupiedSquare = OccupiedSquare(aColumn, aRow, aShip)
  def aHitSquare: HitSquare = HitSquare(aColumn, aRow, aShip)
}

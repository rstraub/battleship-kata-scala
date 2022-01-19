package nl.codecraftr.scala.battleship.squares

import nl.codecraftr.scala.battleship.ShipTdb.aShip
import nl.codecraftr.scala.battleship.squares
import nl.codecraftr.scala.battleship.squares.ColumnsTdb.aColumn
import nl.codecraftr.scala.battleship.squares.RowsTdb.aRow

object SquareTdb {
  def anEmptySquare: EmptySquare = squares.EmptySquare(aColumn, aRow)
  def aMissedSquare: MissedSquare = squares.MissedSquare(aColumn, aRow)
  def anOccupiedSquare: OccupiedSquare =
    squares.OccupiedSquare(aColumn, aRow, aShip)
  def aHitSquare: HitSquare = squares.HitSquare(aColumn, aRow, aShip)
}

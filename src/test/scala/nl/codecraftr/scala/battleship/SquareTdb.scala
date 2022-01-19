package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.ColumnsTdb.aColumn
import nl.codecraftr.scala.battleship.RowsTdb.aRow
import nl.codecraftr.scala.battleship.ShipTdb.aShip
import nl.codecraftr.scala.battleship.squares.{
  EmptySquare,
  HitSquare,
  MissedSquare,
  OccupiedSquare
}

object SquareTdb {
  def anEmptySquare: EmptySquare = squares.EmptySquare(aColumn, aRow)
  def aMissedSquare: MissedSquare = squares.MissedSquare(aColumn, aRow)
  def anOccupiedSquare: OccupiedSquare =
    squares.OccupiedSquare(aColumn, aRow, aShip)
  def aHitSquare: HitSquare = squares.HitSquare(aColumn, aRow, aShip)
}

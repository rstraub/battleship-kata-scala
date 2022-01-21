package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.grid.ColumnsTdb.aColumn
import nl.codecraftr.scala.battleship.grid.RowsTdb.aRow

object SquareTdb {
  def anEmptySquare: Square = SquareCons(aColumn, aRow)

  def aMissedSquare: Square = SquareCons(aColumn, aRow)

  def anOccupiedSquare: Square =
    SquareCons(aColumn, aRow)

  def aHitSquare: Square = SquareCons(aColumn, aRow)
}

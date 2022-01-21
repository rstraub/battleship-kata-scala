package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.ShipTdb.aShip
import nl.codecraftr.scala.battleship.grid.ColumnsTdb.aColumn
import nl.codecraftr.scala.battleship.grid.RowsTdb.aRow

object SquareTdb {
  def aMissedSquare: Square = anEmptySquare.shoot().get

  def aHitSquare: Square = anOccupiedSquare.shoot().get

  def anOccupiedSquare: Square = anEmptySquare.place(aShip).get

  def anEmptySquare: Square = Square(aColumn, aRow)
}

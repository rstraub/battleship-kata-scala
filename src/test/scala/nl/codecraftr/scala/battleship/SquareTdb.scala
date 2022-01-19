package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.A
import nl.codecraftr.scala.battleship.Rows.ONE

object SquareTdb {
  def anEmptySquare: EmptySquare = EmptySquare(A, ONE)
  def anOccupiedSquare: OccupiedSquare = OccupiedSquare(A, ONE, Destroyer())
}

package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.squares.Columns.Column
import nl.codecraftr.scala.battleship.squares.Rows.Row
import nl.codecraftr.scala.battleship.squares._

case class Coordinate(column: Column, row: Row)

case class Grid(squares: Set[Square]) {
  def place(ship: Ship, coordinates: Set[Coordinate]): Option[Grid] = {
    val toReplace: Set[Square] = coordinates.flatMap(findBy)
    val newSquares: Set[Square] = toReplace.flatMap(_.place(ship))
    val updated: Set[Square] = squares -- toReplace ++ newSquares
    Some(copy(squares = updated))
  }

  private def findBy(coordinate: Coordinate): Option[Square] =
    squares.find(s => s.row == coordinate.row && s.column == coordinate.column)
}

object Grid {
  def create(): Grid = Grid(allSquares().toSet)

  private def allSquares() = for {
    c <- Columns.values.toList
    r <- Rows.values.toList
  } yield EmptySquare(c, r)
}

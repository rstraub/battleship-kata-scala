package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.grid.Columns.Column
import nl.codecraftr.scala.battleship.grid.Rows.Row
import nl.codecraftr.scala.battleship.grid._

case class PlacementCoordinate(
    override val column: Column,
    override val row: Row
) extends Coordinate

case class Grid(squares: Set[Square]) {
  def place(ship: Ship, coordinates: Set[Coordinate]): Option[Grid] = {
    val toReplace: Set[Square] = coordinates.flatMap(findBy)
    val newSquares: Set[Square] = toReplace.flatMap(_.place(ship))
    val updated: Set[Square] = squares -- toReplace ++ newSquares
    Some(copy(squares = updated))
  }

  private def findBy(coordinate: Coordinate): Option[Square] =
    squares.find(_.equalTo(coordinate))
}

object Grid {
  def create(): Grid = Grid(emptySquares().toSet)

  private def emptySquares() = for {
    c <- Columns.values.toList
    r <- Rows.values.toList
  } yield EmptySquare(c, r)
}

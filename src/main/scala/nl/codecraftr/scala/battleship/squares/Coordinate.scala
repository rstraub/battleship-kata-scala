package nl.codecraftr.scala.battleship.squares

import nl.codecraftr.scala.battleship.squares.Columns.Column
import nl.codecraftr.scala.battleship.squares.Rows.Row

trait Coordinate {
  val column: Column
  val row: Row
}

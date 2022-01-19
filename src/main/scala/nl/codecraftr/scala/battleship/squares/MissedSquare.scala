package nl.codecraftr.scala.battleship.squares

import nl.codecraftr.scala.battleship.squares.Columns.Column
import nl.codecraftr.scala.battleship.squares.Rows.Row

case class MissedSquare(override val column: Column, override val row: Row)
    extends ShotSquare

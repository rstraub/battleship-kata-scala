package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.Column
import nl.codecraftr.scala.battleship.Rows.Row

case class MissedSquare(override val column: Column, override val row: Row)
    extends ShotSquare

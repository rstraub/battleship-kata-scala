package nl.codecraftr.scala.battleship.squares

import nl.codecraftr.scala.battleship.Ship
import nl.codecraftr.scala.battleship.squares.Columns.Column
import nl.codecraftr.scala.battleship.squares.Rows.Row

case class HitSquare(
    override val column: Column,
    override val row: Row,
    ship: Ship
) extends ShotSquare

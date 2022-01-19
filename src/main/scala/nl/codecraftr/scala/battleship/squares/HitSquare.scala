package nl.codecraftr.scala.battleship.squares

import nl.codecraftr.scala.battleship.Columns.Column
import nl.codecraftr.scala.battleship.Rows.Row
import nl.codecraftr.scala.battleship.Ship

case class HitSquare(
    override val column: Column,
    override val row: Row,
    ship: Ship
) extends ShotSquare

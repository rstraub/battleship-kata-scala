package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.Column
import nl.codecraftr.scala.battleship.Rows.Row

case class HitSquare(
    override val column: Column,
    override val row: Row,
    ship: Ship
) extends ShotSquare

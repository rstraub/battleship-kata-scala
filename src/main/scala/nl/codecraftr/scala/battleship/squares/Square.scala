package nl.codecraftr.scala.battleship.squares

import nl.codecraftr.scala.battleship.Ship

trait Square extends Coordinate {
  def place(ship: Ship): Option[Square] = None

  def shoot(): Option[Square]

  override def toString: String = s"$column${row.id}"
}

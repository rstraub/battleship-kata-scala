package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.Ship

case class Placement(ship: Ship, coordinates: Set[Coordinate]) {
  private def isValid = coordinates.size == ship.occupies

  if (!isValid) throw new IllegalArgumentException("Invalid coordinates")
}

object Placement {
  def apply(ship: Ship, coordinates: Coordinate*): Placement =
    Placement(ship, coordinates.toSet)
}

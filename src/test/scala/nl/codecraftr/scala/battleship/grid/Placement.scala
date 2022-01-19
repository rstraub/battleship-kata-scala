package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.Ship

case class Placement(ship: Ship, coordinates: Set[Coordinate]) {}

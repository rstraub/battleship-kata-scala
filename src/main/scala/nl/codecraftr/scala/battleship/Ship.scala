package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.ShipKinds.{AIRCRAFT_CARRIER, BATTLESHIP, CRUISER, DESTROYER, SUBMARINE, ShipKind}

sealed trait Ship {
  val squares: Set[Square]
  val hits: Set[Square]
  val kind: ShipKind

  def hit(square: Square): Ship

  def isSunk: Boolean = hits == squares
}

object ShipKinds extends Enumeration {
  type ShipKind = Value

  val DESTROYER, CRUISER, SUBMARINE, BATTLESHIP, AIRCRAFT_CARRIER = Value
}

private case class ShipCons(kind: ShipKind, squares: Set[Square], hits: Set[Square] = Set()) extends Ship {
  def hit(square: Square): Ship = copy(hits = this.hits + square)
}

object Ship {
  def aircraftCarrier(square1: Square, square2: Square, square3: Square, square4: Square, square5: Square): Ship =
    ShipCons(AIRCRAFT_CARRIER, Set(square1, square2, square3, square4, square5))

  def battleship(square1: Square, square2: Square, square3: Square, square4: Square): Ship =
    ShipCons(BATTLESHIP, Set(square1, square2, square3, square4))

  def submarine(square1: Square, square2: Square, square3: Square): Ship =
    ShipCons(SUBMARINE, Set(square1, square2, square3))

  def cruiser(square1: Square, square2: Square, square3: Square): Ship =
    ShipCons(CRUISER, Set(square1, square2, square3))

  def destroyer(square1: Square, square2: Square): Ship =
    ShipCons(DESTROYER, Set(square1, square2))
}

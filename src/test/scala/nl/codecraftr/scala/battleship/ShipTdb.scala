package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Ship.{cruiser, destroyer}

object ShipTdb {
  def aShip: Ship = cruiser()
  def aHitShip(hits: Int = 1): Ship = cruiser().copy(hits = hits)
  def aSunkShip: Ship = destroyer().copy(hits = 2)
}

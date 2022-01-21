package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Ship.{cruiser, destroyer}

object ShipTdb {
  def aShip: Ship = cruiser()

  def aHitShip: Ship = cruiser().shoot.get

  def aSunkShip: Ship = destroyer().shoot.flatMap(_.shoot).get
}

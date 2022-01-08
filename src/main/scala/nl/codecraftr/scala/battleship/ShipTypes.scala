package nl.codecraftr.scala.battleship

object ShipTypes extends Enumeration {
  type ShipType = Value

  val DESTROYER, CRUISER, SUBMARINE, BATTLESHIP, AIRCRAFT_CARRIER = Value
}

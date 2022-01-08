package nl.codecraftr.scala.battleship

sealed trait Ship

case object AircraftCarrier extends Ship

case object Battleship extends Ship

case object Submarine extends Ship

case object Cruiser extends Ship

case class Destroyer(s1: String, s2: String) extends Ship

package nl.codecraftr.scala.battleship

sealed trait Ship

object AircraftCarrier extends Ship

object Battleship extends Ship

object Submarine extends Ship

object Cruiser extends Ship

object Destroyer extends Ship

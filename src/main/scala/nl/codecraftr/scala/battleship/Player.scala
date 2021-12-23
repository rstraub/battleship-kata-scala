package nl.codecraftr.scala.battleship

case class Player(ships: Set[Any])

object Player {
  def create(): Player = Player(Set(
    AircraftCarrier,
    Battleship,
    Submarine,
    Cruiser,
    Destroyer
  ))
}

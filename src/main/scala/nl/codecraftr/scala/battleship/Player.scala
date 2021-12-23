package nl.codecraftr.scala.battleship

case class Player(ships: List[String])

object Player {
  def create(): Player = Player(List())
}

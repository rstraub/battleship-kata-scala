package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.grid.Placement

object Game {
  def create(): Game = Game(Player.create(), Player.create())
}

case class Game(playerOne: Player, playerTwo: Player) {
  def place(placement: Placement): Option[Game] =
    playerOne.place(placement).map(p1 => copy(playerOne = p1))
}

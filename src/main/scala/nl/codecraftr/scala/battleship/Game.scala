package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Statuses.PLACING
import nl.codecraftr.scala.battleship.grid.Placement

object Game {
  def create(): Game = Game(Player.create(), Player.create())
}

case class Game(playerOne: Player, playerTwo: Player) {
  def place(placement: Placement): Option[Game] =
    if (playerOne.status == PLACING)
      playerOne.place(placement).map(p1 => copy(playerOne = p1))
    else if (playerTwo.status == PLACING)
      playerTwo.place(placement).map(p2 => copy(playerTwo = p2))
    else None
}

package nl.codecraftr.scala.battleship

object Game {
  def create(): Game = Game(Player.create(), Player.create())
}

case class Game(playerOne: Player, playerTwo: Player) {
  def arrange(player: Player, ship: Ship): Game =
    Game(player.arrange(ship), playerTwo)
}

package nl.codecraftr.scala.battleship

object Game {
  val player1: Player = Player.create()
  val player2: Player = Player.create()

  def arrange(player: Player, ship: Ship): Unit = println("arrange")
}

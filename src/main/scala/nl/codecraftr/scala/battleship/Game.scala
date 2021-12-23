package nl.codecraftr.scala.battleship

object Game {
  val playerOne: Player = Player.create()
  val playerTwo: Player = Player.create()

  def arrange(player: Player, ship: Ship): Unit = println("arrange")
}

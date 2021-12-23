package nl.codecraftr.scala.battleship

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GameSpec extends AnyFlatSpec with Matchers {
  "game" should "have two players" in {
    Game.playerOne shouldBe Player.create()
    Game.playerTwo shouldBe Player.create()
  }

  "arrange" should "allow player one to arrange his ships" in {
    Game arrange(Game.playerOne, AircraftCarrier)
  }
}

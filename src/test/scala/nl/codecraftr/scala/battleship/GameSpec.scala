package nl.codecraftr.scala.battleship

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GameSpec extends AnyFlatSpec with Matchers {
  "game" should "have two players" in {
    Game.player1 shouldBe Player.create()
    Game.player2 shouldBe Player.create()
  }

  "arrange" should "allow player one to arrange his ships" in {
    Game.arrange(Game.player1, AircraftCarrier)
  }
}

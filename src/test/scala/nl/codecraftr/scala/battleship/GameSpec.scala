package nl.codecraftr.scala.battleship
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GameSpec extends AnyFlatSpec with Matchers {
  "game" should "have two players" in {
    Game.player1 shouldBe Player()
    Game.player2 shouldBe Player()
  }
}


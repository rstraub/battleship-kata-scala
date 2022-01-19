package nl.codecraftr.scala.battleship

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GameSpec extends AnyFlatSpec with Matchers {
  "game" should "have two players" in {
    val game = Game.create()
    game.playerOne shouldBe Player.create()
    game.playerTwo shouldBe Player.create()
  }
}

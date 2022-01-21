package nl.codecraftr.scala.battleship

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class GameSpec extends AnyFunSpec with Matchers {
  it("should have two players") {
    val game = Game.create()
    game.playerOne shouldBe Player.create()
    game.playerTwo shouldBe Player.create()
  }
}

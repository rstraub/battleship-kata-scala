package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.B
import nl.codecraftr.scala.battleship.Rows.{ONE, TWO}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GameSpec extends AnyFlatSpec with Matchers {
  "game" should "have two players" in {
    val game = Game.create()
    game.playerOne shouldBe Player.create()
    game.playerTwo shouldBe Player.create()
  }

  "arrange" should "allow player one to arrange his ships" in {
    val game = Game.create()

    val result = game.arrange(game.playerOne, Destroyer(Square(B, ONE), Square(B, TWO)))

    result.playerOne.ships should have size 1
  }
}

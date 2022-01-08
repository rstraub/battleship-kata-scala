package nl.codecraftr.scala.battleship

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PlayerSpec extends AnyFlatSpec with Matchers {
  "player" should "not have placed ships" in {
    val result = Player.create().ships

    result should have size 0
  }

  it should "have a grid on which they place ships" in {
    Player.create().grid shouldBe Grid.create()
  }
}


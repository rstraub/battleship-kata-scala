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

  "arrange" should "place the ship in new player" in {
    val player = Player.create()

    val result = player.arrange(Destroyer("B1", "B2"))

    result.ships should contain(Destroyer("B1", "B2"))
  }
}


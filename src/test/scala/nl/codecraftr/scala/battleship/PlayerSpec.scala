package nl.codecraftr.scala.battleship

import org.scalatest.BeforeAndAfterEach
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PlayerSpec extends AnyFlatSpec with Matchers with BeforeAndAfterEach {
  private var player: Player = _

  override def beforeEach(): Unit = {
    player = Player.create()
  }

  "player" should "not have placed ships" in {
    val result = player.ships

    result should have size 0
  }

  it should "have a grid on which they place ships" in {
    player.grid shouldBe Grid.create()
  }

  "arrange" should "place the ship in new player with its coordinates" in {
    val result = player
      .arrange(Destroyer("B1", "B2"))
      .arrange(Submarine("C1", "C2", "C3"))

    result.ships should contain allOf(
      Destroyer("B1", "B2"),
      Submarine("C1", "C2", "C3")
    )
  }
}


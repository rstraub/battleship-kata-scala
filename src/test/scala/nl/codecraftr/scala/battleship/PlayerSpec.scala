package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.{B, C}
import nl.codecraftr.scala.battleship.Rows.{ONE, THREE, TWO}
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
    val destroyer = Destroyer(Square(ONE, B), Square(TWO, B))
    val submarine = Submarine(Square(ONE, C), Square(TWO, C), Square(THREE, C))

    val result = player
      .arrange(destroyer)
      .arrange(submarine)

    result.ships should contain allOf(
      destroyer,
      submarine
    )
  }
}


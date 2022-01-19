package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.B
import nl.codecraftr.scala.battleship.Rows.{ONE, TWO}
import org.scalatest.BeforeAndAfterEach
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PlayerSpec extends AnyFlatSpec with Matchers with BeforeAndAfterEach {
  private val square1: Square = Square(B, ONE)
  private val square2: Square = Square(B, TWO)
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

  it should "return false given no ships" in {
    player.fleetSunk shouldBe false
  }

}

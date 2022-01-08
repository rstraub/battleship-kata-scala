package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.{B, C}
import nl.codecraftr.scala.battleship.Rows.{ONE, THREE, TWO}
import nl.codecraftr.scala.battleship.Ship.destroyer
import org.scalatest.BeforeAndAfterEach
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PlayerSpec extends AnyFlatSpec with Matchers with BeforeAndAfterEach {
  private val square1: Square = Square(B, ONE)
  private val square2: Square = Square(B, TWO)
  private val aShip = destroyer(square1, square2)
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
    val destroyer = Ship.destroyer(square1, square2)

    val submarine = Ship.submarine(Square(C, ONE), Square(C, TWO), Square(C, THREE))

    val result = player
      .arrange(destroyer)
      .arrange(submarine)
    result.ships should contain allOf(
      destroyer,
      submarine
    )
  }

  "fleetSunk" should "return false given ships left" in {
    player.arrange(aShip).fleetSunk shouldBe false
  }

  it should "return true given all ships are sunk" in {
    val sunkShip = aShip.hit(square1).hit(square2)
    player.arrange(sunkShip).fleetSunk shouldBe true
  }

  it should "return false given no ships" in {
    player.fleetSunk shouldBe false
  }
}


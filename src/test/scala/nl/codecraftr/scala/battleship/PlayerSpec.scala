package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.{B, C, D}
import nl.codecraftr.scala.battleship.Rows.{ONE, TEN, THREE, TWO}
import nl.codecraftr.scala.battleship.Ship.{destroyer, submarine}
import org.scalatest.BeforeAndAfterEach
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PlayerSpec extends AnyFlatSpec with Matchers with BeforeAndAfterEach {
  private val square1: Square = Square(B, ONE)
  private val square2: Square = Square(B, TWO)
  private val aShip = destroyer(square1, square2)
  private val anotherShip = submarine(Square(D, ONE), Square(D, TWO), Square(D, THREE))
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

  "shoot" should "register hit on a ship given correct square" in {
    player = player arrange aShip arrange anotherShip

    val result = player shot square1

    result.ships should have size 2
    result.ships should contain(anotherShip)
    result.ships.flatMap(_.hits) should have size 1
  }

  it should "not register hit given incorrect square" in {
    player = player arrange aShip

    player shot Square(C, TEN) shouldBe player
  }

  "fleetSunk" should "return false given ships left" in {
    player.arrange(aShip).fleetSunk shouldBe false
  }

  it should "return true given all ships are sunk" in {
    player
      .arrange(aShip)
      .shot(square1)
      .shot(square2)
      .fleetSunk shouldBe true
  }

  it should "return false given no ships" in {
    player.fleetSunk shouldBe false
  }

}


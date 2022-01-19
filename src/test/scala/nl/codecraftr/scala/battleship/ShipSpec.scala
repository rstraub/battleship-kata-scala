package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Ship._
import org.scalatest.BeforeAndAfterEach
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShipSpec extends AnyFlatSpec with Matchers with BeforeAndAfterEach {
  override def beforeEach(): Unit = {}

  "Destroyer" should "take up two squares" in {
    destroyer().occupies shouldBe 2
  }

  "Submarine" should "take up three squares" in {
    submarine().occupies shouldBe 3
  }

  "Cruiser" should "take up three squares" in {
    cruiser().occupies shouldBe 3
  }

  "Battleship" should "take up four squares" in {
    battleship().occupies shouldBe 4
  }

  "AircraftCarrier" should "take up five squares" in {
    aircraftCarrier().occupies shouldBe 5
  }

  "shoot" should "return ship with +1 hit" in {
    val ship = cruiser().copy(hits = 1)
    ship.shoot() shouldBe Some(ship.copy(hits = 2))
  }

  it should "return none given ship is already sunk" in {
    val ship = destroyer().copy(hits = 2)

    ship.shoot() shouldBe None
  }

  "isSunk" should "return true given all squares are hit" in {}

  it should "return false given not all squares are hit" in {}
}

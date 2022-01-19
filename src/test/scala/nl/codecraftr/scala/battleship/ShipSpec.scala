package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.ShipTdb.aShip
import org.scalatest.BeforeAndAfterEach
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShipSpec extends AnyFlatSpec with Matchers with BeforeAndAfterEach {
  override def beforeEach(): Unit = {}

  "Destroyer" should "take up two squares" in {
    Destroyer().occupies shouldBe 2
  }

  "Submarine" should "take up three squares" in {
    Submarine().occupies shouldBe 3
  }

  "Cruiser" should "take up three squares" in {
    Cruiser().occupies shouldBe 3
  }

  "Battleship" should "take up four squares" in {
    Battleship().occupies shouldBe 4
  }

  "AircraftCarrier" should "take up five squares" in {
    AircraftCarrier().occupies shouldBe 5
  }

  "shoot" should "return ship with +1 hit" in {
    val ship = Destroyer()
    ship.shoot() shouldBe Some(aShip)
  }

  it should "return none given ship is already sunk"

  "isSunk" should "return true given all squares are hit" in {}

  it should "return false given not all squares are hit" in {}
}

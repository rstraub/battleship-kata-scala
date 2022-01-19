package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Ship._
import nl.codecraftr.scala.battleship.ShipTdb.aShip
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
    aShip.shoot() shouldBe Some(aShip.copy(hits = 1))
  }

  it should "return none given ship is already sunk"

  "isSunk" should "return true given all squares are hit" in {}

  it should "return false given not all squares are hit" in {}
}

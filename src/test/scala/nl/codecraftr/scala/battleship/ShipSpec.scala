package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Ship._
import nl.codecraftr.scala.battleship.ShipTdb.{aHitShip, aSunkShip}
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
    aHitShip().shoot() shouldBe Some(aHitShip(hits = 2))
  }

  it should "return none given ship is already sunk" in {
    aSunkShip.shoot() shouldBe None
  }

  "isSunk" should "return true given all squares are hit" in {
    val result = destroyer().copy(hits = 1).shoot().get

    result.isSunk shouldBe true
  }

  it should "return false given not all squares are hit" in {
    val result = destroyer().shoot().get

    result.isSunk shouldBe false
  }
}

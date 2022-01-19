package nl.codecraftr.scala.battleship

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

  "hit" should "register hit" in {}

  it should "should be sunk given all squares are hit" in {}

  it should "not be sunk otherwise" in {}
}

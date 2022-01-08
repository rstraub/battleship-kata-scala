package nl.codecraftr.scala.battleship

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShipSpec extends AnyFlatSpec with Matchers {
  "Destroyer" should "take up two squares" in {
    Destroyer("B1", "B2").squares shouldBe Set("B1", "B2")
  }

  "Submarine" should "take up three squares" in {}
  "Cruiser" should "take up three squares" in {}
  "Battleship" should "take up four squares" in {}
  "AircraftCarrier" should "take up five squares" in {}
}

package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.B
import nl.codecraftr.scala.battleship.Rows.{ONE, TWO}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShipSpec extends AnyFlatSpec with Matchers {
  "Destroyer" should "take up two squares" in {
    Destroyer(Square(ONE, B), Square(TWO, B)).squares shouldBe Set(Square(ONE, B), Square(TWO, B))
  }

  "Submarine" should "take up three squares" in {}
  "Cruiser" should "take up three squares" in {}
  "Battleship" should "take up four squares" in {}
  "AircraftCarrier" should "take up five squares" in {}
}

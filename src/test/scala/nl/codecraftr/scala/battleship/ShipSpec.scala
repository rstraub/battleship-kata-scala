package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.B
import nl.codecraftr.scala.battleship.Rows.{FIVE, FOUR, ONE, THREE, TWO}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShipSpec extends AnyFlatSpec with Matchers {
  "Destroyer" should "take up two squares" in {
    Destroyer(Square(B, ONE), Square(B, TWO))
      .squares
      .shouldBe(Set(Square(B, ONE), Square(B, TWO)))
  }

  "Submarine" should "take up three squares" in {
    Submarine(Square(B, ONE), Square(B, TWO), Square(B, THREE))
      .squares
      .shouldBe(Set(Square(B, ONE), Square(B, TWO), Square(B, THREE)))
  }

  "Cruiser" should "take up three squares" in {
    Cruiser(Square(B, ONE), Square(B, TWO), Square(B, THREE))
      .squares
      .shouldBe(Set(Square(B, ONE), Square(B, TWO), Square(B, THREE)))
  }

  "Battleship" should "take up four squares" in {
    Battleship(Square(B, ONE), Square(B, TWO), Square(B, THREE), Square(B, FOUR))
      .squares
      .shouldBe(Set(Square(B, ONE), Square(B, TWO), Square(B, THREE), Square(B, FOUR)))
  }

  "AircraftCarrier" should "take up five squares" in {
    AircraftCarrier(Square(B, ONE), Square(B, TWO), Square(B, THREE), Square(B, FOUR), Square(B, FIVE))
      .squares
      .shouldBe(Set(Square(B, ONE), Square(B, TWO), Square(B, THREE), Square(B, FOUR), Square(B, FIVE)))
  }
}

package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.B
import nl.codecraftr.scala.battleship.Rows.{FIVE, FOUR, ONE, THREE, TWO}
import nl.codecraftr.scala.battleship.Ship._
import org.scalatest.BeforeAndAfterEach
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShipSpec extends AnyFlatSpec with Matchers with BeforeAndAfterEach {
  private val b1 = Square(B, ONE)
  private val b2 = Square(B, TWO)
  private var ship: Ship = _

  override def beforeEach(): Unit = {
    ship = destroyer(b1, b2)
  }

  "Destroyer" should "take up two squares" in {
    destroyer(Square(B, ONE), Square(B, TWO))
      .squares
      .shouldBe(Set(Square(B, ONE), Square(B, TWO)))
  }

  "Submarine" should "take up three squares" in {
    submarine(Square(B, ONE), Square(B, TWO), Square(B, THREE))
      .squares
      .shouldBe(Set(Square(B, ONE), Square(B, TWO), Square(B, THREE)))
  }

  "Cruiser" should "take up three squares" in {
    cruiser(Square(B, ONE), Square(B, TWO), Square(B, THREE))
      .squares
      .shouldBe(Set(Square(B, ONE), Square(B, TWO), Square(B, THREE)))
  }

  "Battleship" should "take up four squares" in {
    battleship(Square(B, ONE), Square(B, TWO), Square(B, THREE), Square(B, FOUR))
      .squares
      .shouldBe(Set(Square(B, ONE), Square(B, TWO), Square(B, THREE), Square(B, FOUR)))
  }

  "AircraftCarrier" should "take up five squares" in {
    aircraftCarrier(Square(B, ONE), Square(B, TWO), Square(B, THREE), Square(B, FOUR), Square(B, FIVE))
      .squares
      .shouldBe(Set(Square(B, ONE), Square(B, TWO), Square(B, THREE), Square(B, FOUR), Square(B, FIVE)))
  }

  "hit" should "register hit" in {
    val result = ship hit b1
    result.hits should contain(b1)
  }

  it should "should be sunk given all squares are hit" in {

  }

  it should "not be sunk otherwise" in {}
}

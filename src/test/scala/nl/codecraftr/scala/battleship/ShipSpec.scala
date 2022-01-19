package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.B
import nl.codecraftr.scala.battleship.Rows.{ONE, THREE, TWO}
import org.scalatest.BeforeAndAfterEach
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShipSpec extends AnyFlatSpec with Matchers with BeforeAndAfterEach {
  private val b1 = Square(B, ONE)
  private val b2 = Square(B, TWO)
  private val b3 = Square(B, THREE)
  private var ship: Ship = _

  override def beforeEach(): Unit = {}

  "Destroyer" should "take up two squares" in {}

  "Submarine" should "take up three squares" in {}

  "Cruiser" should "take up three squares" in {}

  "Battleship" should "take up four squares" in {}

  "AircraftCarrier" should "take up five squares" in {}

  "hit" should "register hit" in {}

  it should "should be sunk given all squares are hit" in {}

  it should "not be sunk otherwise" in {}
}

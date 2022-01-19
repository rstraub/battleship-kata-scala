package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.A
import nl.codecraftr.scala.battleship.Rows.ONE
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SquareSpec extends AnyFlatSpec with Matchers {
  "toString" should "return readable representation" in {
    EmptySquare(A, ONE).toString shouldBe "A1"
  }

  // TODO create simple TDBs for square
  "place" should "return occupied square given empty square" in {
    val result = EmptySquare(A, ONE).place(Destroyer())

    result shouldBe Some(OccupiedSquare(A, ONE, Destroyer()))
  }

  it should "return none given an occupied square" in {
    val result = OccupiedSquare(A, ONE, Destroyer()).place(Destroyer())

    result shouldBe None
  }
}

package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.A
import nl.codecraftr.scala.battleship.Rows.ONE
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SquareSpec extends AnyFlatSpec with Matchers {
  "toString" should "return readable representation" in {
    Square(A, ONE).toString shouldBe "A1"
  }

  "place" should "return occupied square given empty square" in {}
}

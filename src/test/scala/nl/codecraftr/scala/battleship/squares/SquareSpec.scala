package nl.codecraftr.scala.battleship.squares

import nl.codecraftr.scala.battleship.squares.Columns.A
import nl.codecraftr.scala.battleship.squares.Rows.ONE
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SquareSpec extends AnyFlatSpec with Matchers {
  "toString" should "return readable representation" in {
    EmptySquare(A, ONE).toString shouldBe "A1"
  }
}

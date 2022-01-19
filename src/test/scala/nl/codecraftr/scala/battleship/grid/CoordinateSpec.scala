package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.grid.Columns.{A, B}
import nl.codecraftr.scala.battleship.grid.Rows.{ONE, TWO}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CoordinateSpec extends AnyFlatSpec with Matchers {
  "equalTo" should "return true given same coordinate" in {
    Target(A, ONE).equalTo(
      Target(A, ONE)
    ) shouldBe true
  }

  it should "return false given a different row" in {
    Target(A, ONE).equalTo(
      Target(A, TWO)
    ) shouldBe false
  }

  it should "return false given a different column" in {
    Target(A, ONE).equalTo(
      Target(B, ONE)
    ) shouldBe false
  }
}

package nl.codecraftr.scala.battleship.squares

import nl.codecraftr.scala.battleship.PlacementCoordinate
import nl.codecraftr.scala.battleship.squares.Columns.{A, B}
import nl.codecraftr.scala.battleship.squares.Rows.{ONE, TWO}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CoordinateSpec extends AnyFlatSpec with Matchers {
  "equalTo" should "return true given same coordinate" in {
    PlacementCoordinate(A, ONE).equalTo(
      PlacementCoordinate(A, ONE)
    ) shouldBe true
  }

  it should "return false given a different row" in {
    PlacementCoordinate(A, ONE).equalTo(
      PlacementCoordinate(A, TWO)
    ) shouldBe false
  }

  it should "return false given a different column" in {
    PlacementCoordinate(A, ONE).equalTo(
      PlacementCoordinate(B, ONE)
    ) shouldBe false
  }
}

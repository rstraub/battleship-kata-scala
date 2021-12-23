package nl.codecraftr.scala.battleship

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GridSpec extends AnyFlatSpec with Matchers {
  private val squares = Grid.create().squares

  "grid" should "have a size of ten by ten squares" in {
    squares should have size 100
  }

  "columns" should "run from A to J" in {
    squares.map(_.column) shouldBe Columns.values
  }

  "rows" should "run from 1 to 10" in {
    squares.map(_.row) shouldBe Rows.values
  }
}

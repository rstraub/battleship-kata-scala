package nl.codecraftr.scala.battleship

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GridSpec extends AnyFlatSpec with Matchers {
  private val grid = Grid.create()

  "grid" should "have a size of ten by ten squares" in {
    grid.squares should have size 100
  }

  "columns" should "run from A to J" in {
    val expected = Columns.values

    grid.squares.map(_.column) shouldBe expected
  }
}

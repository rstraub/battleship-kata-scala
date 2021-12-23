package nl.codecraftr.scala.battleship

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GridSpec extends AnyFlatSpec with Matchers {
  private val grid = Grid.create()

  "grid" should "have a size of ten by ten squares" in {
    grid.squares.flatten should have size 100
  }

  "x-axis" should "run from A to J" in {
    val squares = for {
      row <- List()
      column <- List()
    } yield Square(row, column)

    grid.squares shouldBe squares
  }
}

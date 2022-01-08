package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.B
import nl.codecraftr.scala.battleship.Rows.ONE
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GridSpec extends AnyFlatSpec with Matchers {
  private val squares = Grid.create().squares
  private val square = Square(B, ONE)

  "grid" should "have a size of ten by ten squares" in {
    squares should have size 100
  }

  "columns" should "run from A to J" in {
    squares.map(_.column) shouldBe Columns.values
  }

  "rows" should "run from 1 to 10" in {
    squares.map(_.row) shouldBe Rows.values
  }

  "shot" should "register squares that have been shot" in {
    Grid.create().shot(square).shots should contain(square)
  }

  it should "return exception given same square is shot twice" in {
    Grid.create().shot(square).shot(square) shouldBe Left(s"Square $square was already shot")
  }
}

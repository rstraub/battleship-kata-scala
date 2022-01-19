package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.Ship.destroyer
import nl.codecraftr.scala.battleship.grid.Columns.A
import nl.codecraftr.scala.battleship.grid.GridTdb.aGrid
import nl.codecraftr.scala.battleship.grid.Rows.{ONE, TWO}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GridSpec extends AnyFlatSpec with Matchers {
  private val squares = aGrid.squares

  "grid" should "have a size of ten by ten squares" in {
    squares should have size 100
  }

  "columns" should "run from A to J" in {
    squares.map(_.column) shouldBe Columns.values
  }

  "rows" should "run from 1 to 10" in {
    squares.map(_.row) shouldBe Rows.values
  }

  "place" should "place a ship given valid placement" in {
    val ship = destroyer()
    val result =
      aGrid
        .place(
          ship,
          Set(Target(A, ONE), Target(A, TWO))
        )
        .get

    result.squares.contains(OccupiedSquare(A, ONE, ship)) shouldBe true
    result.squares.contains(OccupiedSquare(A, TWO, ship)) shouldBe true
  }

  it should "return none given placed on occupied square" in {}
}

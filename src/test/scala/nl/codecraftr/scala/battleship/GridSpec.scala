package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.GridTdb.aGrid
import nl.codecraftr.scala.battleship.Ship.destroyer
import nl.codecraftr.scala.battleship.squares.Columns.A
import nl.codecraftr.scala.battleship.squares.Rows.{ONE, TWO}
import nl.codecraftr.scala.battleship.squares.{Columns, OccupiedSquare, Rows}
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

  "place" should "place a ship given valid placement" ignore {
    val ship = destroyer()
    val result = aGrid.place(ship, Set((A, ONE), (A, TWO))).get

    result.squares.contains(OccupiedSquare(A, ONE, ship)) shouldBe true
    result.squares.contains(OccupiedSquare(A, TWO, ship)) shouldBe true
  }

  it should "return none given placed on occupied square" in {}
}

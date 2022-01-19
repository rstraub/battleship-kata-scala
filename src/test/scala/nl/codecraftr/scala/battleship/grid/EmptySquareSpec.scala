package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.ShipTdb.aShip
import nl.codecraftr.scala.battleship.grid.SquareTdb.anEmptySquare
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class EmptySquareSpec extends AnyFlatSpec with Matchers {
  "place" should "return occupied square" in {
    val square = anEmptySquare
    val result = square.place(aShip)

    result shouldBe Some(OccupiedSquare(square.column, square.row, aShip))
  }

  "shoot" should "return missed square" in {
    val square = anEmptySquare
    val result = square.shoot()

    result shouldBe Some(MissedSquare(square.column, square.row))
  }
}

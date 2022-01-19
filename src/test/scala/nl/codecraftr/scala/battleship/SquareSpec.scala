package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.Columns.A
import nl.codecraftr.scala.battleship.Rows.ONE
import nl.codecraftr.scala.battleship.ShipTdb.aShip
import nl.codecraftr.scala.battleship.SquareTdb.{
  aMissedSquare,
  anEmptySquare,
  anOccupiedSquare
}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SquareSpec extends AnyFlatSpec with Matchers {
  "toString" should "return readable representation" in {
    EmptySquare(A, ONE).toString shouldBe "A1"
  }

  "place" should "return occupied square given empty square" in {
    val square = anEmptySquare
    val result = square.place(aShip)

    result shouldBe Some(OccupiedSquare(square.column, square.row, aShip))
  }

  it should "return none given an occupied square" in {
    val result = anOccupiedSquare.place(aShip)

    result shouldBe None
  }

  it should "return none given missed square" in {
    val result = aMissedSquare

    result.place(aShip) shouldBe None
  }

  "shoot" should "return missed square given empty square" in {
    val square = anEmptySquare
    val result = square.shoot()

    result shouldBe Some(MissedSquare(square.column, square.row))
  }

  it should "return hit square given occupied square" in {
    val square = anOccupiedSquare
    val result = square.shoot()

    result shouldBe Some(HitSquare(square.column, square.row, square.ship))
  }
}

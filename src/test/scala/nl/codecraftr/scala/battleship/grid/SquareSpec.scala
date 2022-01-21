package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.ShipTdb.aShip
import nl.codecraftr.scala.battleship.grid.Columns.A
import nl.codecraftr.scala.battleship.grid.Rows.ONE
import nl.codecraftr.scala.battleship.grid.SquareTdb.{
  aHitSquare,
  aMissedSquare,
  anEmptySquare,
  anOccupiedSquare
}
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class SquareSpec extends AnyFunSpec with Matchers {
  describe("toString") {
    it("should return readable representation") {
      SquareCons(A, ONE).toString shouldBe "A1"
    }
  }

  describe("place") {
    it("should return occupied square given empty square") {
      val square = anEmptySquare
      val result = square.place(aShip)

      result shouldBe Some(SquareCons(square.column, square.row, Some(aShip)))
    }

    it("should return none given an occupied square") {
      val result = anOccupiedSquare.place(aShip)

      result shouldBe None
    }

    it("should return none given missed square") {
      val result = aMissedSquare.place(aShip)

      result shouldBe None
    }

    it("should return none given hit square") {
      val result = aHitSquare.place(aShip)

      result shouldBe None
    }
  }

  describe("shoot") {
    it("should return missed square given empty square") {
      val square = anEmptySquare
      val result = square.shoot()

      result shouldBe Some(SquareCons(square.column, square.row))
    }

    it("should return hit square given occupied square") {
      val square = anOccupiedSquare
      val result = square.shoot()

      result shouldBe Some(SquareCons(square.column, square.row, square.ship))
    }

    it("should return none given missed square") {
      val result = aMissedSquare.shoot()

      result shouldBe None
    }

    it("should return none given a hit square") {
      val result = aHitSquare.shoot()

      result shouldBe None
    }
  }
}

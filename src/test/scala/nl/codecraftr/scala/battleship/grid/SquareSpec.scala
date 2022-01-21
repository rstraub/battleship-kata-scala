package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.ShipTdb.aShip
import nl.codecraftr.scala.battleship.grid.Columns.A
import nl.codecraftr.scala.battleship.grid.Rows.ONE
import nl.codecraftr.scala.battleship.grid.Square.emptySquare
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
      emptySquare(A, ONE).toString shouldBe "A1"
    }
  }

  describe("place") {
    it("should return occupied square given empty square") {
      val square = anEmptySquare
      val result = square.place(aShip).get

      result.ship shouldBe Some(aShip)
      result.column shouldBe square.column
      result.row shouldBe square.row
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
      val result = square.shoot().get

      result.miss shouldBe true
    }

    it("should return hit square given occupied square") {
      val square = anOccupiedSquare
      val result = square.shoot().get

      result.hit shouldBe true
    }

    it("should return none given missed square") {
      aMissedSquare.shoot() shouldBe None
    }

    it("should return none given a hit square") {
      aHitSquare.shoot() shouldBe None
    }
  }

  describe("hit and miss") {
    it("should return hit given shot and occupied") {
      aHitSquare.hit shouldBe true
      aHitSquare.miss shouldBe false
    }

    it("should return miss given shot and empty") {
      aMissedSquare.hit shouldBe false
      aMissedSquare.miss shouldBe true
    }

    it("should return false for hit and miss given unshot") {
      anEmptySquare.hit shouldBe false
      anEmptySquare.miss shouldBe false
    }
  }
}

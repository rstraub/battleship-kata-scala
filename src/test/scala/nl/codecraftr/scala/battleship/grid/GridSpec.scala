package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.Ship.destroyer
import nl.codecraftr.scala.battleship.grid.Columns.A
import nl.codecraftr.scala.battleship.grid.GridTdb.aGrid
import nl.codecraftr.scala.battleship.grid.PlacementTdb.aPlacement
import nl.codecraftr.scala.battleship.grid.Rows.{ONE, THREE, TWO}
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class GridSpec extends AnyFunSpec with Matchers {
  private val squares = aGrid.squares

  describe("creation") {
    it("should have a size of ten by ten squares") {
      squares should have size 100
    }

    it("should have columns from A to J") {
      squares.map(_.coordinate).map(_.column) shouldBe Columns.values
    }

    it("should run from 1 to 10") {
      squares.map(_.coordinate).map(_.row) shouldBe Rows.values
    }
  }

  describe("place") {
    it("should place a ship given valid placement") {
      val ship = destroyer()
      val placement = Placement(ship, Coordinate(A, ONE), Coordinate(A, TWO))
      val result =
        aGrid
          .place(placement)
          .get

      result.findBy(Coordinate(A, ONE)).get.isOccupied shouldBe true
      result.findBy(Coordinate(A, TWO)).get.isOccupied shouldBe true
    }

    // TODO
    it("should return none given placed on occupied square") {}
  }

  describe("shoot") {
    it("should return grid with a miss and no hits given no hits") {
      val result = aGrid
        .place(Placement(destroyer(), Coordinate(A, TWO), Coordinate(A, THREE)))
        .flatMap(_.shoot(Coordinate(A, ONE)))
        .get

      result.misses should have size 1
      result.hits should have size 0
    }

    it("should return grid with a hit and no misses given a ship is shot") {
      val result = aGrid
        .place(Placement(destroyer(), Coordinate(A, ONE), Coordinate(A, TWO)))
        .flatMap(_.shoot(Coordinate(A, ONE)))
        .get

      result.hits should have size 1
      result.misses should have size 0
    }
  }

  describe("ships") {
    it("should return the ships placed on the grid") {
      val result = aGrid.place(aPlacement).get.ships

      result should have size 1
      result should contain(aPlacement.ship)
    }

    it("should return empty set given no ships on the grid") {
      aGrid.ships shouldBe empty
    }
  }
}

package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.ShipTdb.aShip
import nl.codecraftr.scala.battleship.grid.SquareTdb.anOccupiedSquare
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class OccupiedSquareSpec extends AnyFlatSpec with Matchers {
  "place" should "return none" in {
    val result = anOccupiedSquare.place(aShip)

    result shouldBe None
  }

  "shoot" should "return hit square" in {
    val square = anOccupiedSquare
    val result = square.shoot()

    result shouldBe Some(HitSquare(square.column, square.row, square.ship))
  }
}

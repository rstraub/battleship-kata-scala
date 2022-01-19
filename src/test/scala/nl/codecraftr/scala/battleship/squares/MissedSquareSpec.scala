package nl.codecraftr.scala.battleship.squares

import nl.codecraftr.scala.battleship.ShipTdb.aShip
import nl.codecraftr.scala.battleship.squares.SquareTdb.aMissedSquare
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MissedSquareSpec extends AnyFlatSpec with Matchers {
  "place" should "return none" in {
    val result = aMissedSquare.place(aShip)

    result shouldBe None
  }

  "shoot" should "return none" in {
    val result = aMissedSquare.shoot()

    result shouldBe None
  }
}

package nl.codecraftr.scala.battleship.squares

import nl.codecraftr.scala.battleship.ShipTdb.aShip
import nl.codecraftr.scala.battleship.squares.SquareTdb.aHitSquare
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HitSquareSpec extends AnyFlatSpec with Matchers {
  "place" should "return none" in {
    val result = aHitSquare.place(aShip)

    result shouldBe None
  }

  "shoot" should "return none" in {
    val result = aHitSquare.shoot()

    result shouldBe None
  }
}

package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.Ship.destroyer
import nl.codecraftr.scala.battleship.grid.Columns.{A, B, C}
import nl.codecraftr.scala.battleship.grid.Rows.{ONE, TWO}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PlacementSpec extends AnyFlatSpec with Matchers {
  it should "be created given valid coordinates" in {
    val coordinates: Set[Coordinate] = Set(Target(A, ONE), Target(B, TWO))
    val result = Placement(destroyer(), coordinates)

    result.ship shouldBe destroyer()
    result.coordinates shouldBe coordinates
  }

  it should "not be created given too many coordinates" in {
    val coordinates: Set[Coordinate] =
      Set(Target(A, ONE), Target(B, TWO), Target(C, TWO))

    an[IllegalArgumentException] shouldBe thrownBy(
      Placement(destroyer(), coordinates)
    )
  }

  it should "not be created given too few coordinates" in {}

  it should "not be created given coordinates are not adjacent" in {}
}

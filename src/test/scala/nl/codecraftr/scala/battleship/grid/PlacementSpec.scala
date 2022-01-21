package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.Ship.destroyer
import nl.codecraftr.scala.battleship.grid.Columns.{A, B, C}
import nl.codecraftr.scala.battleship.grid.Rows.{ONE, TWO}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PlacementSpec extends AnyFlatSpec with Matchers {
  it should "be created given valid coordinates" in {
    val coordinates: Set[Coordinate] =
      Set(Coordinate(A, ONE), Coordinate(B, TWO))
    val result = Placement(destroyer(), coordinates)

    result.ship shouldBe destroyer()
    result.coordinates shouldBe coordinates
  }

  it should "be created given variadic coordinates" in {
    val result = Placement(destroyer(), Coordinate(A, ONE), Coordinate(B, TWO))

    result.ship shouldBe destroyer()
    result.coordinates shouldBe Set(Coordinate(A, ONE), Coordinate(B, TWO))
  }

  it should "not be created given too many coordinates" in {
    val coordinates: Set[Coordinate] =
      Set(Coordinate(A, ONE), Coordinate(B, TWO), Coordinate(C, TWO))

    an[IllegalArgumentException] shouldBe thrownBy(
      Placement(destroyer(), coordinates)
    )
  }

  it should "not be created given too few coordinates" in {
    val coordinates: Set[Coordinate] =
      Set(Coordinate(A, ONE))

    an[IllegalArgumentException] shouldBe thrownBy(
      Placement(destroyer(), coordinates)
    )
  }

  // TODO
  it should "not be created given rows are not adjacent" in {}

  // TODO
  it should "not be created given columns are not adjacent" in {}
}

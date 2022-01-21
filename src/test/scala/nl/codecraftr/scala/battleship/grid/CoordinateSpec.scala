package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.grid.Columns.A
import nl.codecraftr.scala.battleship.grid.Rows.ONE
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class CoordinateSpec extends AnyFunSpec with Matchers {
  describe("toString") {
    it("should return readable representation") {
      Coordinate(A, ONE).toString shouldBe "A1"
    }
  }
}

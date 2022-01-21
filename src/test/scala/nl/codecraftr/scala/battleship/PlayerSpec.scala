package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.grid.Grid
import nl.codecraftr.scala.battleship.grid.GridTdb.aGridWithShip
import nl.codecraftr.scala.battleship.grid.PlacementTdb.aPlacement
import org.mockito.Mockito.when
import org.scalatest.BeforeAndAfterEach
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.mockito.MockitoSugar

class PlayerSpec
    extends AnyFunSpec
    with Matchers
    with BeforeAndAfterEach
    with MockitoSugar {
  private val grid = mock[Grid]
  private var player: Player = _

  override def beforeEach(): Unit = {
    player = Player(grid)
  }

  describe("place") {
    it("should return a new player given ship placed on grid correctly") {
      when(grid.place(aPlacement)).thenReturn(Some(aGridWithShip))
      val result = player.place(aPlacement).get

      result.grid shouldBe aGridWithShip
    }

    it("should return none otherwise") {
      when(grid.place(aPlacement)).thenReturn(None)

      player.place(aPlacement) shouldBe None
    }
  }
}

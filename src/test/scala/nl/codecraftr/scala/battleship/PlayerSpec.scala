package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.grid.PlacementTdb.aPlacement
import org.scalatest.BeforeAndAfterEach
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.mockito.MockitoSugar

class PlayerSpec
    extends AnyFunSpec
    with Matchers
    with BeforeAndAfterEach
    with MockitoSugar {
  private var player: Player = _

  override def beforeEach(): Unit = {
    player = Player.create()
  }

  describe("place") {
    it("should return a new player given ship placed on grid correctly") {
      val result = player.place(aPlacement).get

      result.grid should not be player.grid
      result.ships should have size 1
    }

    it("should return none otherwise") {}
  }
}

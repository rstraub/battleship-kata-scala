package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.grid.{Grid, Placement}
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

  describe("create") {
    it("have a grid on which they place ships") {
      player.grid shouldBe Grid.create()
    }
  }

  describe("place") {
    it("should return a new player given ship placed on grid correctly") {
      val placement = mock[Placement]

    }

    it("should return none otherwise") {}
  }
}

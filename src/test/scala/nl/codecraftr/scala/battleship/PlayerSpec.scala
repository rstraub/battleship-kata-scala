package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.grid.Grid
import org.scalatest.BeforeAndAfterEach
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class PlayerSpec extends AnyFunSpec with Matchers with BeforeAndAfterEach {
  private var player: Player = _

  override def beforeEach(): Unit = {
    player = Player.create()
  }

  describe("create") {
    it("have a grid on which they place ships") {
      player.grid shouldBe Grid.create()
    }
  }
}

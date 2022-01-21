package nl.codecraftr.scala.battleship

import nl.codecraftr.scala.battleship.PlayerTdb.aPlayer
import nl.codecraftr.scala.battleship.Statuses.{PLACING, READY}
import nl.codecraftr.scala.battleship.grid.PlacementTdb.aPlacement
import org.mockito.Mockito.when
import org.scalatest.BeforeAndAfter
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.mockito.MockitoSugar

class GameSpec
    extends AnyFunSpec
    with Matchers
    with MockitoSugar
    with BeforeAndAfter {
  private val playerOne = mock[Player]
  private val playerTwo = mock[Player]
  private var game: Game = _

  before {
    game = Game(playerOne, playerTwo)
  }

  it("should have two players") {
    val game = Game.create()
    game.playerOne shouldBe Player.create()
    game.playerTwo shouldBe Player.create()
  }

  describe("place") {
    it("should place ships on player one whilst its status is placing") {
      when(playerOne.status).thenReturn(PLACING)
      when(playerOne.place(aPlacement)).thenReturn(Some(aPlayer))

      val result = game.place(aPlacement).get

      result.playerOne should not be game.playerOne
      result.playerOne shouldBe aPlayer
    }

    it("should place ships on player two given player one is ready") {
      when(playerOne.status).thenReturn(READY)

      when(playerTwo.place(aPlacement)).thenReturn(Some(aPlayer))

      val result = game.place(aPlacement).get

      result.playerOne shouldBe game.playerOne
      result.playerTwo should not be game.playerTwo
      result.playerTwo shouldBe aPlayer
    }

    it("should return none if both players placed their ships") {}
  }
}

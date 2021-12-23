package nl.codecraftr.scala.battleship

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PlayerSpec extends AnyFlatSpec with Matchers {
  "player" should "have all five ships" in {
    val result = Player.create().ships

    result should contain allOf(
      AircraftCarrier,
      Battleship,
      Submarine,
      Cruiser,
      Destroyer
    )
  }
}


package nl.codecraftr.scala.battleship

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GridSpec extends AnyFlatSpec with Matchers {
  "grid" should "have a size of ten by ten squares" in {
    Grid.create().squares.flatten should have size 100
  }
}

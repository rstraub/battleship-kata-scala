package nl.codecraftr.scala.battleship

sealed abstract class Ship(val hits: Int, val occupies: Int) {
  def hit(): Ship = this
  def isSunk: Boolean = hits == occupies
}

case class Destroyer(override val hits: Int = 0)
    extends Ship(hits, occupies = 2)

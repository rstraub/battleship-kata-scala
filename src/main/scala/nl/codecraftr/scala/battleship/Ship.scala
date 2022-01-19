package nl.codecraftr.scala.battleship

sealed trait Ship {
  val hits: Int
  val squares: Int

  def hit(): Ship

  def isSunk: Boolean = hits == squares
}

object Ship {}

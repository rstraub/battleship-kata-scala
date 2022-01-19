package nl.codecraftr.scala.battleship

trait ShotSquare extends Square {
  override def shoot(): Option[Square] = None
}

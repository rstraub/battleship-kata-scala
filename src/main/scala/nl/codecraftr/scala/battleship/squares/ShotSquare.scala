package nl.codecraftr.scala.battleship.squares

trait ShotSquare extends Square {
  override def shoot(): Option[Square] = None
}

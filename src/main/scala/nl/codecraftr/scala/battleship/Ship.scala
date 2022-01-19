package nl.codecraftr.scala.battleship

sealed abstract class Ship(val occupies: Int, val hits: Int) {
  def shoot(): Ship = this

  final def isSunk: Boolean = hits == occupies

  protected def withHits(hits: Int): Ship
}

case class Destroyer(override val hits: Int = 0)
    extends Ship(occupies = 2, hits) {
  override def withHits(hits: Int): Ship = copy(hits = hits)
}

case class Submarine(override val hits: Int = 0)
    extends Ship(occupies = 3, hits) {
  override def withHits(hits: Int): Ship = copy(hits = hits)
}

case class Cruiser(override val hits: Int = 0)
    extends Ship(occupies = 3, hits) {
  override def withHits(hits: Int): Ship = copy(hits = hits)
}

case class Battleship(override val hits: Int = 0)
    extends Ship(occupies = 4, hits) {
  override def withHits(hits: Int): Ship = copy(hits = hits)
}

case class AircraftCarrier(override val hits: Int = 0)
    extends Ship(occupies = 5, hits) {
  override def withHits(hits: Int): Ship = copy(hits = hits)
}

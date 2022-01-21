package nl.codecraftr.scala.battleship

sealed trait Ship {
  val occupies: Int
  val hits: Int

  def shoot: Option[Ship]

  def isSunk: Boolean = hits == occupies
}

object Ship {
  def destroyer(): Ship = ShipCons(2)

  def submarine(): Ship = ShipCons(3)

  def cruiser(): Ship = ShipCons(3)

  def battleship(): Ship = ShipCons(4)

  def aircraftCarrier(): Ship = ShipCons(5)

  private case class ShipCons(
      override val occupies: Int,
      override val hits: Int = 0
  ) extends Ship {
    def shoot: Option[Ship] =
      if (hits < occupies) Some(copy(hits = hits + 1))
      else None
  }
}

package nl.codecraftr.scala.battleship

object Statuses extends Enumeration {
  type Status = Value

  val PLACING, READY: Statuses.Value = Value
}

package nl.codecraftr.scala.battleship

case class Player(ships: Set[Ship], grid: Grid)

object Player {
  def create(): Player = Player(
    Set(), Grid.create()
  )
}

package nl.codecraftr.scala.battleship.grid

import nl.codecraftr.scala.battleship.Ship

case class Grid(squares: Set[Square]) {
  def place(placement: Placement): Option[Grid] = {
    val Placement(ship, coordinates) = placement
    val toReplace = findAll(coordinates)
    val newSquares = toReplace.flatMap(_.place(ship))
    Some(replace(toReplace, newSquares))
  }

  private def replace(orig: Set[Square], using: Set[Square]): Grid = {
    val updated = squares -- orig ++ using
    copy(squares = updated)
  }

  private def findAll(coordinates: Set[Coordinate]): Set[Square] =
    coordinates.flatMap(findBy)

  def findBy(coordinate: Coordinate): Option[Square] =
    squares.find(_.equalTo(coordinate))

  def shoot(target: Coordinate): Option[Grid] = {
    val toReplace = findBy(target)
    val newSquare = toReplace.flatMap(_.shoot())
    val both = toReplace.zip(newSquare)
    both.map(both => replace(both._1, both._2))
  }

  private def replace(orig: Square, using: Square): Grid =
    replace(Set(orig), Set(using))

  def misses: Set[Square] = squares.filter(_.miss)

  def hits: Set[Square] = squares.filter(_.hit)

  def ships: Set[Ship] = squares.flatMap(_.ship)
}

object Grid {
  def create(): Grid = Grid(emptySquares().toSet)

  private def emptySquares() = for {
    c <- Columns.values.toList
    r <- Rows.values.toList
  } yield Square(c, r)
}

package factions

trait Piece {
  val faction: Faction
}

trait Token extends Piece

trait Building extends Piece

trait Warrior extends Piece

package board

import card.ClearingSuit
import factions.{Building, Faction, Piece, Token, Warrior}

import scala.collection.mutable.ListBuffer

class Clearing(val suit: ClearingSuit, private val numBuildingSpots: Int, val ruins: Int) {
  val pieces: ListBuffer[Piece] = ListBuffer.empty
  
  val buildingSpots: Vector[BuildSpot] = Vector.fill(numBuildingSpots)(BuildSpot())
}

case object EmptyBuilding

class BuildSpot {
  val building: Building | EmptyBuilding.type = EmptyBuilding
}

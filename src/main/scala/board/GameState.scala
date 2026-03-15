package board

import cats.data.NonEmptyList
import factions.TurnPhase.BIRD_SONG
import factions.{Faction, TurnPhase}

class GameState(val players: NonEmptyList[Faction]) {
  val currentPlayer: Faction = players.head
  
  val phase: TurnPhase = BIRD_SONG
}

package board

sealed trait GameMap {
  val clearings: Set[Clearing]

  val adjList: Map[Clearing, List[(Clearing, Path)]]
}

case class WinterMap() extends GameMap {
  override val clearings: Set[Clearing] = ???
  override val adjList: Map[Clearing, List[(Clearing, Path)]] = ???
}

sealed trait Path

case class LandPath() extends Path

case class RiverPath() extends Path
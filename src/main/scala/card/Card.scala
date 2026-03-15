package card

trait Card {
  val suit: CardSuit
}

sealed trait CraftableCard extends Card {
  def craftingCost: CraftingCost
}

case class ItemCard(item: Item, suit: CardSuit) extends CraftableCard {
  def victoryPoints: Int = item.victoryPoints

  override def craftingCost: CraftingCost = item.craftingCost
}

sealed trait AbilityCard extends CraftableCard {

}

case class Dominance(suit: CardSuit) extends Card

object Dominance {
  def all: Vector[Dominance] = CardSuit.all.map(Dominance.apply)
}

case class Ambush(suit: CardSuit) extends Card

object Ambush {
  def all: Vector[Ambush] = CardSuit.nonBird.map(Ambush.apply) ++ List.fill(2)(Ambush(Bird))
}

package card

case object WildSuit

case class CraftingCost(suits: Vector[ClearingSuit | WildSuit.type])

object CraftingCost {
  def apply(suits: (ClearingSuit | WildSuit.type)*): CraftingCost =
    CraftingCost(suits.toVector)
}

package card

sealed trait Item {
  val victoryPoints: Int
  val craftingCost: CraftingCost
}

object Item {
  val all: Seq[Item] = Seq(
    Bag(),
    Boot(),
    Crossbow(),
    Hammer(),
    Sword(),
    RootTea(),
    Coins()
  )
}

case class Bag() extends Item {
  val victoryPoints = 1
  val craftingCost = CraftingCost(Mouse)
}

case class Boot() extends Item {
  val victoryPoints = 1
  val craftingCost = CraftingCost(Bunny)
}

case class Crossbow() extends Item {
  val victoryPoints = 1
  val craftingCost = CraftingCost(Fox)
}

case class Hammer() extends Item {
  val victoryPoints = 2
  val craftingCost = CraftingCost(Fox)
}

case class Sword() extends Item {
  val victoryPoints = 2
  val craftingCost = CraftingCost(Fox, Fox)
}

case class RootTea() extends Item {
  val victoryPoints = 2
  val craftingCost = CraftingCost(Mouse)
}

case class Coins() extends Item {
  val victoryPoints = 3
  val craftingCost = CraftingCost(Bunny, Bunny)
}
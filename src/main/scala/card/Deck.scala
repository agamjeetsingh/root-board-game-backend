package card

sealed trait Deck {
  def craftableSuits(item: Item): Seq[CardSuit]

  lazy val cards: Vector[Card] = {
    val itemCards = Item.all.flatMap(item => craftableSuits(item).map(ItemCard(item, _)))
    Ambush.all ++ Dominance.all ++ itemCards
  }
}

class ExilesPartisans extends Deck {
  override def craftableSuits(item: Item): Seq[CardSuit] = item match {
    case Bag()      => CardSuit.all
    case Boot()     => CardSuit.all
    case Crossbow() => Seq(Bird, Mouse)
    case Hammer()   => Seq(Fox)
    case Sword()    => Seq(Bird, Mouse, Fox)
    case RootTea()  => CardSuit.nonBird
    case Coins()    => CardSuit.nonBird
  }
}
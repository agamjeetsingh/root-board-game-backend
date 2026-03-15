package card

sealed trait Suit

sealed trait ClearingSuit extends Suit
sealed trait CardSuit extends Suit

case object Bunny extends CardSuit, ClearingSuit
case object Fox extends CardSuit, ClearingSuit
case object Mouse extends CardSuit, ClearingSuit

case object Bird extends CardSuit

object ClearingSuit {
  val all: Vector[ClearingSuit] = Vector(Bunny, Fox, Mouse)
}

object CardSuit {
  val nonBird: Vector[CardSuit] = Vector(Bunny, Fox, Mouse)
  val all: Vector[CardSuit] = nonBird :+ Bird
}

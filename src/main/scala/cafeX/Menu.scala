package cafeX

object Temperature extends Enumeration {
  type Temperature = Value
  val Hot = Value("Hot")
  val Cold = Value("Cold")
}

import Temperature._
import cafeX.MenuItem.Pence

object MenuItem {
  type Pence = Int
}

trait MenuItem {
  def name: String
  def temperature: Temperature
  def price: Pence
}

sealed abstract class Beverage extends MenuItem
sealed abstract class Food extends MenuItem

case class Coffee() extends Beverage {
  val name = "Coffee"
  val temperature = Hot
  val price = 100
}

case class Cola() extends Beverage {
  val name = "Cola"
  val temperature = Cold
  val price = 50
}

case class CheeseSandwich() extends Food {
  val name = "Cheese Sandwich"
  val temperature = Cold
  val price = 200
}

case class SteakSandwich() extends Food {
  val name = "Steak Sandwich"
  val temperature = Hot
  val price = 450
}

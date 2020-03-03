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

sealed trait MenuItem {
  val name: String
  val temp: Temperature
  val price: Pence
}


case class Beverage(name: String, temp: Temperature, price: Pence)
  extends MenuItem
case class Food(name: String, temp: Temperature, price: Pence)
  extends  MenuItem

object Coffee extends
  Beverage("Coffee", Hot, 100)

object Cola extends
  Beverage("Cola", Cold, 50)

object CheeseSandwich extends
  Food("Cheese Sandwich", Cold, 200)

object SteakSandwich extends 
  Food("Steak Sandwich",  Hot, 450)

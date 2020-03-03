package cafeX

object Order {
  import Temperature._
  type Order = List[MenuItem]

  def standardBill(order: Order) =
    order.foldRight(0) { case (menuItem, total) =>
      total + menuItem.price
    }

  def serviceCharge(order: Order) = {
    val percentages = order.map{
      case f: Beverage => 0
      case Food(_,Hot,_)  => 5
      case Food(_,_,_) => 10
    }
    val charge = standardBill(order)/percentages.max
    Math.min(charge,2000)
  }
}

package cafeX

object Order {
  type Order = List[MenuItem]

  def standardBill(order: Order) =
    order.foldRight(0) { case (menuItem, total) =>
      total + menuItem.price
    }

  def serviceCharge(order: Order) = {
    val foods: Seq[Food] = order.collect{ case f: Food => f }
    val charge = if (foods.size == 0) 0
    else { // we have food
      if (foods.exists(_.temperature == Temperature.Hot))
        standardBill(order)/5
      else standardBill(order)/10
    }
    Math.min(charge,2000)
  }
}

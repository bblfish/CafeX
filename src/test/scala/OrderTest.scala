import cafeX.Order.Order
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import cafeX._

class OrderTest extends AnyFunSuite with Matchers {
  val suppliedOrder: Order = List(Cola(),Coffee(),CheeseSandwich())
  val hotFoodOrder: Order = List(Cola(),Coffee(),SteakSandwich())
  val bigOrder: Order = List.fill(10)(SteakSandwich())
  val vBigOrder: Order = List.fill(30)(SteakSandwich())

  test("object test") {
    Order.standardBill(suppliedOrder) should be(350)
    Order.standardBill(hotFoodOrder) should be(600)
    Order.standardBill(bigOrder) should be(4500)
    Order.standardBill(vBigOrder) should be(13500)
  }

  test("object service charge")  {
    Order.serviceCharge(suppliedOrder) should be(35)
    Order.serviceCharge(hotFoodOrder) should be(120)
    Order.serviceCharge(bigOrder) should be(900)
    Order.serviceCharge(vBigOrder) should be(2000)
  }

}

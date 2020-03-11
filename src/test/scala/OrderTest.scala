
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import cafeX._
import cafeX.Order._

class OrderTest extends AnyFunSuite with Matchers {
  val suppliedOrder: Order = List(Cola,Coffee,CheeseSandwich)
  val hotFoodOrder: Order = List(Cola,Coffee,SteakSandwich)
  val bigOrder: Order = List.fill(10)(SteakSandwich)
  val vBigOrder: Order = List.fill(30)(SteakSandwich)

  test("standard bill test") {
    standardBill(suppliedOrder) should be(350)
    standardBill(hotFoodOrder) should be(600)
    standardBill(bigOrder) should be(4500)
    standardBill(vBigOrder) should be(13500)
  }

  test("object service charge")  {
    serviceCharge(suppliedOrder) should be(35)
    serviceCharge(hotFoodOrder) should be(120)
    serviceCharge(bigOrder) should be(900)
    serviceCharge(vBigOrder) should be(2000)
  }

  import Live._
  
  test("fizbuzz") {
    fizbuz(0) should be(fb)
    fizbuz(3) should be(fiz)
    fizbuz(5) should be(buzz)
    fizbuz(15) should be(fb)
    fizbuz(30) should be(fb)
    fizbuz(2) should be("2")

  }


}

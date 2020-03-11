package cafeX

object Live {
  val fiz: String = "fiz"
  val buzz: String = "buzz"
  val fb: String = fiz + buzz

  def fizbuz(entry: Int): String = {
    (entry % 3, entry % 5) match {
      case (0,0) => fb
      case (0,_) => fiz
      case (_,0) => buzz
      case _ => entry.toString
     }
  }
}

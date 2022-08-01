object Q1 {

  def interest(deposit: Float) : Float = deposit match {
    case d if d <= 20000.00f => d * 0.02f
    case d if d <= 200000.00f => d * 0.04f
    case d if d <= 2000000.00f => d * 0.035f
    case d => d * 0.06f
  }

  def main(args: Array[String]): Unit = {
    println(interest(10000))
    println(interest(100000))
    println(interest(1000000))
    println(interest(10000000))
  }
}
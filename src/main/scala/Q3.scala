case class Car(name: String, price: Double)

class CarUUID(car: Car){
  def getUUID : Int = car.name.hashCode()
}

object Q3 {

  def main(args: Array[String]): Unit = {
    val bmw3 = Car("bmw 3 series", 20000.00)
    val bmw5 = Car("bmw 5 series", 50000.00)
    val vwPasSat = Car("vw pasSat", 10000.00)
    val vwGolf = Car("vw golf", 12000.00)
    val mazda3 = Car("mazda 3", 15000.00)

    val cars = Array(bmw3, bmw5, vwPasSat, vwGolf, mazda3)
    for(car <- cars) {
      val c = new CarUUID(car)
      println("car uuid = " + car.name + " - " + c.getUUID)
    }

  }
}

import scala.io.StdIn.readInt

object Q2 {

  def checkNumber(number: Int): Unit = number match {
    case number if number == 0 => println("Zero.")
    case number if number < 0 => println("Negative number.")
    case number if number % 2 == 0 => println("Even number.")
    case _ => println("Odd number.")
  }

  def main(args: Array[String]): Unit ={
    print("Enter a number: ")
    val num = readInt()
    checkNumber(num)
  }
}

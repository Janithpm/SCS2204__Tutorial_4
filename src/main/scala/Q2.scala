import scala.io.StdIn.readInt

object Q2 {

  def checkNumber(number: Int): Unit = number match {
    case number if number <= 0 => println("Negative/Zero")
    case number if number % 2 == 0 => println("Even")
    case _ => println("Odd")
  }

  def main(args: Array[String]): Unit ={
    print("Enter a number: ")
    val num = readInt()
    checkNumber(num)
  }
}

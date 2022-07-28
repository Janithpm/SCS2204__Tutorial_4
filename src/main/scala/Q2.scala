case class Item (name: String, price: Float, quantity: Int)

object Q2 {

  def printShoppingCart(items: Array[Item]): Unit = for (item <- items)
    println(item.quantity + " " + item.name + " at RS " + item.price + " each.")

  def printSelectedItem(searchFor: String, items: Array[Item]): Unit = for (item <- items)
    if(item.name == searchFor)
      println(item.quantity + " " + item.name + " at RS " + item.price + " each.")
    else
      println("Found another item.")

  def main(args: Array[String]): Unit ={
    val vanillaIceCreams = Item("Vanilla ice cream", 3.99f, 13)
    val chocolateBiscuits = Item("Chocolate biscuits", 4.00f, 6)
    val cupcakes = Item("Cupcake", 7.77f, 7)

    val shoppingCart = Array(vanillaIceCreams, chocolateBiscuits, cupcakes)

    printShoppingCart(shoppingCart)
    println("----------------------------------------------")
    printSelectedItem("Vanilla ice cream", shoppingCart)
  }

}

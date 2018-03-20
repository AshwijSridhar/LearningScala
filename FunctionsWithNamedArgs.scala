package week2

object FunctionsWithNamedArgs {

  def main(args: Array[String]): Unit = {
     printInt(x =10,y =122)
  }

  def printInt(x:Int,y:Int): Unit ={

    println("value of x is"  +x)
    println("value of y is "  +y)
  }

}

package week2

object callingFunctions {

  def main(args: Array[String]): Unit = {
    println("the returned value is "  +addInt(30,40))
  }


  def addInt(x:Int,y:Int): Int ={

    var sum:Int = 0
    sum = x+y
    return  sum

  }
}

package week2

object DefaultParameterObject {

  def main(args: Array[String]): Unit = {
    println("The sum of x and y is : " +add())

  }

  def add(x:Int = 5,y:Int = 35): Int ={

    var sum = 0
    sum = x + y
    return sum

  }

}

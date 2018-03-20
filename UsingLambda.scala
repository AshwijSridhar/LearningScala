package week2

object UsingLambda {

  def main(args: Array[String]): Unit = {

    //use the rocket symbol => to define the function

    //val square = (x:Int) => x*x
    val square : Double => Double = x => x*x //Double => Double means Lambda takes Double & returns Double

    println("square of 4 is " +square(4))


    //example 2: multiply number by two

    val twice: Double => Double  = _*2 //here _ represents any
    println("two times 24 is "  +twice(24))


    // example 3 : check for the greater number

    val greater:(Double,Double) => Boolean = _>_
    println("greater of 2389 ,13121 is " +greater(2389,13121))
  }


  //NOTE : usually the definition takes '=>' followed by '=' where = is used to give function
  // definition. But that is not the case in example 1


}

package week2

object HigherOrderFunction {

  def main(args: Array[String]): Unit = {
    println(functionExample(33,multiplyBy2)) // passing function as a parameter
  }

  def functionExample(a:Int,f:Int => Int): Unit ={
    println(f(a))                  // calling that function
  }

  def multiplyBy2(a:Int):Int ={
    a*2
  }

}

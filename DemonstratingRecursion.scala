package week2

object DemonstratingRecursion {

  def main(args: Array[String]): Unit = {
    println("the factorial of 5 is :" +factorial(5))
  }



  def factorial(n:Int): Int ={
    if(n==0)1
    else
      n * factorial(n-1)
  }

}

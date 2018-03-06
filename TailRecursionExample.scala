package week2

object TailRecursionExample {


  def main(args: Array[String]): Unit = {
    println("the gcd of 15,138 is : " +gcd(15,138))
  }


  def gcd(a:Int,b:Int):Int ={
    if(b==0)a
    else
      gcd(b,a%b)
  }


}

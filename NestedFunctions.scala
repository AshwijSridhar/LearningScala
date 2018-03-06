package week2

object NestedFunctions {

  def main(args: Array[String]): Unit = {
    println("the max of 173,778,899 is : " +max(173,778,899))
  }

  def max(x:Int,y:Int,z:Int) ={
     def max(a:Int,b:Int)= if(a>b)a else b
     max(x,max(y,z))
  }
}

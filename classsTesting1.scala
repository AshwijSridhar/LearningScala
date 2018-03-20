package week2

class classsTesting1(x:Int,y:Int){

  val xc = x
  val yc = y

  def printVals(): Unit ={
    println("xc and yc : " +xc +" " +yc)
  }
}

object classsTesting1{

  def main(args: Array[String]): Unit = {

    val c = new classsTesting1(15,30)
    c.printVals()
  }
}







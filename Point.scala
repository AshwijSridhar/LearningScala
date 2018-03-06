package week2

class Point(xc:Int,yc:Int) {

  var x = xc
  var y = yc

  def move(dx:Int,dy:Int): Unit ={

    x = dx + x
    y = dy + y

    println("the Location of point x is :  "  +x)
    println("the Location of y is : "  +y)

  }

}

object pointObject{

  def main(args: Array[String]): Unit = {

    val p = new Point(3,5)   // object for Point
    p.move(7,10)
  }
}
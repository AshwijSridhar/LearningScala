package week2

object ExceptionHandling2 {

  def main(args: Array[String]): Unit = {

  var x:String = "123444"
    val y:Any = try{

      x.toInt
    }catch{
      case ex : NumberFormatException => {println("number format exception")}

    }

    println(y)



  }
}
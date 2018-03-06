package week2

object AnonymousFunction {

  def main(args: Array[String]): Unit = {

    var result1 = (a:Int,b:Int)=>a+b
    var result2 = (_:Int)+(_:Int)

    println("result1" +result1(13,25))
    println("result2" +result2(22,11))

  }

}

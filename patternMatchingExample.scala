package week2

object patternMatchingExample {
  def main(args: Array[String]): Unit = {
    println(matchTest(5))

  }

  def matchTest(x:Int):String = x match {

    case 1 => "one Match"
    case 2 => "two Match"
    case _ => "many Matches"
  }
}

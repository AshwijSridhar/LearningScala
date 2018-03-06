package week2

object patternMatchingWithOptions {
  def main(args: Array[String]): Unit = {
    val capitals = Map("France" -> "Paris","Japan" -> "Tokyo")
    println("the capital of India is"   +show(capitals.get("India")));
      println("the capital of France is "   +show(capitals.get("France"))


      )


  }

  def show(x:Option[String]) = x match {

    case Some(a) => a
    case None => " \"Not defined\" "


  }
}

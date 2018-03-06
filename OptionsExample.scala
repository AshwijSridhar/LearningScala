package week2

object OptionsExample {

  def main(args: Array[String]): Unit = {

    val capitals = Map("France" -> "Paris","Japan" -> "Tokyo" )

    println("the capital of France" +capitals.get("France"))
    println("the capital of Japan " +capitals.get("Japan"))
    println("the capital of India "  +capitals.get("India"))

  }

}
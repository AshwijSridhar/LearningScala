package week2

import scala.collection.immutable._

object scalaMaps {

  def main(args: Array[String]): Unit = {

    var map1 = Map("Dhoni" -> 7,"Kholi" -> 18,"tendulkar" -> 10)
    var map2 = Map(("Dhoni",7),("Kholi",18))

    println(map1)
    println(map2)

    //access the values using keys

    println(map1("Dhoni"))

    //add new element
    var map3 = map1+("Cats" -> 35)
    println(map3)

    //delete element
    var map4 = map1 - ("Dhoni")
    println(map4)
  }
}

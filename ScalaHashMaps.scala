package week2

import scala.collection.immutable._

object ScalaHashMaps {

  def main(args: Array[String]): Unit = {

    var Hashmap1 = HashMap("Dhoni" -> 7,"Kholi" -> 18,"tendulkar" -> 10)
    var Hashmap2 = HashMap(("Dhoni",7),("Kholi",18))

    println(Hashmap1)

    Hashmap1.foreach{
      case (key,value) => println(key +"->" + value)
    }
    println(Hashmap2)

    //access the values using keys

    println(Hashmap1("Dhoni"))

    //add new element
    var Hashmap3 = Hashmap1 +("Cats" -> 35)
    println(Hashmap3)

    //delete element
    var Hashmap4 = Hashmap1 - ("Dhoni")
    println(Hashmap4)
  }

}

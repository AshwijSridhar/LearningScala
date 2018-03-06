package week2

import scala.collection.immutable.HashSet

object hashSets {

  def main(args: Array[String]): Unit = {


    var hashSet = HashSet(4, 3, 1, 4, 334, 1)

    hashSet.foreach((element: Int) => println(element))
  }

}

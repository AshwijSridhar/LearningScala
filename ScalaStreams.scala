package week2

import scala.collection.immutable._

object ScalaStreams {

  def main(args: Array[String]): Unit = {

    var streams = 1#::2#::3#::Stream.empty
    println(streams)

    var stream2 = (1 to 10).toStream
    println(stream2)

    var firstElement = stream2.head
    println(firstElement)

  }


}

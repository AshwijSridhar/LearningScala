package week2
import scala.collection.immutable
object VectorExample {

  def main(args: Array[String]): Unit = {


    var vector1 = Vector("hockey", "cricket", "golf")
    var vector2 = Vector("swimming")

    vector1.foreach((elements: String) => println(elements))

    //adding elements

    var newVector = vector1:+ "racing"
    println("new Vector" +newVector)

    //merging two vectors
    var mergeVectors = vector1++vector2
    println("after merging vector1 and vector 2  "  +mergeVectors)

    //reverse vectors

    var revVector = vector1.reverse
    println("reversed vector1  "  +revVector)


    //sorting vectors

    var sortVector = mergeVectors.sorted
    println("sorted merge vectors  "   +sortVector)



  }
}


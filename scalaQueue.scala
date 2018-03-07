package week2
import scala.collection.immutable._
object scalaQueue {

  def main(args: Array[String]): Unit = {

    var Q1 = Queue(1,2,3,4,5,6,3333,33,23,13,789,14)
    println("elemens of Q1" +Q1)
    var Q1Front = Q1.front
    println("first of Q1 "  +Q1Front)


    // add elements

    var Q2 = Q1.enqueue(23)
    println("Q2 "  +Q2)


    //delete from Q
    var Q3 = Q1.dequeue
    println("deleted " +Q3)
  }

}

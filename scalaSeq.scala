package week2
import scala.collection.immutable
object scalaSeq {

  def main(args: Array[String]): Unit = {

    val seq1:Seq[Int]= Seq(2,23,2,13,46,1)
    seq1.foreach((elements:Int)=>println(elements))

    println("Accessing sequences via indexes")
    println(seq1(3))

    //operations on sequences

    println("\nis Empty: "+seq1.isEmpty)
    println("Ends with (46,1): "+ seq1.endsWith(Seq(46,1)))
    println("contains 8: "+ seq1.contains(8))
    println("last index of 13 : "+seq1.lastIndexOf(13))
    println("Reverse order of sequence: "+seq1.reverse)
  }

}

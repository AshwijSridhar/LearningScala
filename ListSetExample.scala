package week2
import scala.collection.immutable._
object ListSetExample {

  def main(args: Array[String]): Unit = {

    var listset = ListSet(1,23,344,1333,233)

    listset.foreach((elements:Int)=>println(elements))
  }

  var listset2:ListSet[String]= new ListSet() //creating empty listset by calling constructor
  var listSet3:ListSet[String] = ListSet.empty // empty listset by using empty

  println("printing empty lists")
  println(listset2)
  println(listSet3)

  //add elements into listset

  listset2+= "ashwij"
  listSet3+= "something"

  println("after adding elements into the list")
  println(listset2)
  println(listSet3)
}

package week2

object ScalaLists {


  def main(args: Array[String]): Unit = {

    var list1 = List(1,2,3,3,4,44,331,1131,233)
    var list2 =List(221,23)

    println(list1)
    println(list2)

    //merging two lists

    var lis3 = list1++list2
    println("merged list " +lis3)

    //reverse list
    var list4 = list1.reverse
    list4.foreach((elements:Any)=>print("\n" +elements))

    //sort list
    var list5 = list1.sorted
    print("sorted list1 "  +list5)
  }

}

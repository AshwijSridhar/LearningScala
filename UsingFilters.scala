package week2

object UsingFilters {

  def main(args: Array[String]): Unit = {

    val x = List.range(1,10)
    println("members of the List "  +x)
    //create a filter to return only the even numbers in the list

    val evenNum = x.filter(_%2==0)
    println("even numbers in the list "  +evenNum)

    val fruits = Set("apples","oranges","waterMelon","Pear","banana")
    val MemStartsWithA = fruits.filter(_.startsWith("a"))
    println("starting with A " +MemStartsWithA )

    val LengthGreaterThan5 = fruits.filter(_.length>5)
    println("Members of list of length > 5 "   +LengthGreaterThan5)


    // Filter to get only the Strings from the list
    val listAny:List[Any] = List(1,2,"sasda","asda",33,"asd")

    val listAnyFilter = listAny.filter{
      case s: String => true
      case _ => false
    }

    println("List any Filter "   +listAnyFilter)
  }
}

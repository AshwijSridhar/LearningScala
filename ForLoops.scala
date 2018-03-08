package week2

object ForLoops {

  def main(args: Array[String]): Unit = {


    var names = List("kohli", "dhoni", "rohit", "sachin")

    for (i <- names) println(i)

    println("Capitalized")
    for (n<-names){
      println(n.capitalize)
    }

    //using generators

    println("single generator")
    for(i<-0 to 10 )println(i)

    // Multiple Generators

    val nums = List(1,2,3,4)
    val letters = List('A','B','C','D')
    var result = for {
      n<-nums
      c<- letters
    } yield (n,c)
    println(result)

    //for loops with guard conditions

    println("executing guard conditions")
    for(i<-1 to 10 if i > 4) println(i)


   //several guard conditions

  println("executing several guard conditions")

          for {
               i <- 1 to 10
               if i > 3
               if i < 6
               if i % 2 == 0
              } println(i)

  }

}

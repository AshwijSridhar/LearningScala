package week2

object ScalaTuples {


  def main(args: Array[String]): Unit = {

    val x = (7,"something",8,"something 2",3.1416)

    //accessing the tuple elements

    println(x._1)
    println(x._2)
    println(x._5)

    //use variable names to access the tuple elements

    def getUserInfo = ("Al",42,200.0)

    // call that method and assign the tuples results directly
  
    val(name,age,weight) = getUserInfo

    getUserInfo.productIterator.foreach(println)

    println("name " +name)
    println("age " +age)
    println("weight " +weight)

    //convert tuple to string
    println(getUserInfo.toString())


  }
}

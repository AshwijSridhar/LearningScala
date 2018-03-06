package week2

object callByName {

  def main(args: Array[String]): Unit = {
    delayed(time())

  }

  def time() ={
    println("getting time in nanoseconds")
    System.nanoTime()
  }

  def delayed( t: => Long ) = { //here t is defined to be call by name
    println("In delayed method")
    println("Param: " + t)
  }



}

package week2

import io.StdIn._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object FutureTesting {

  def main(args: Array[String]): Unit = {

  println("This is First") // to show printing in future is happening parallelly (THIRD)
val f = Future{ /*--------------First */
   println("Printing in the future...")
}
 /* only future will not execute because the main thread ends before the future does */

 /* using readLine() so as to pause the ending of the main thread */
    Thread.sleep(1000)
  println("This is last") // to show that printing in future is happening parallelly  (THIRD)
    readLine() /*------------second */

  }

}

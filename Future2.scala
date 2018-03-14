package week2


import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import io.StdIn._
import scala.util.Failure
import scala.util.Success
object Future2 {

  def main(args: Array[String]): Unit = {



      val f2 = Future {
        for (i <- 1 to 30) yield (ParallelCollect.fib(i))
        //uncomment to check for exception
        //throw new RuntimeException("My Bad")
      }
    //This will work only if the calculation is done successfully or else use onComplete
    //f2.foreach(println)
     //using onComplete
    f2.onComplete{

      case Success(n) => println(n)
      case Failure(ex) => println("something went wrong  "  +ex)

    }

 Thread.sleep(5000)

  }


}

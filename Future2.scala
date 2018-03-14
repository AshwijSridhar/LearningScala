package week2


import scala.concurrent.Future
import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import io.StdIn._
import scala.util.Failure
import scala.util.Success
object Future2 {

  def main(args: Array[String]): Unit = {



      val f2 = Future {
        for (i <- 1 to 30) yield (ParallelCollect.fib(i))
        //uncomment to check for exception
        // throw new RuntimeException("My Bad")
      }

     println(Await.result(f2,5 seconds) ) //used to execute future in main

    //This will work only if the calculation is done successfully or else use onComplete
    //f2.foreach(println)
     //using onComplete
    /*f2.onComplete{

      case Success(n) => println(n)
      case Failure(ex) => println("something went wrong  "  +ex)

    }


*/
    var page2 = Future{

      "facebook" +io.Source.fromURL("https://www.facebook.com").take(100).mkString
    }
    var page3 = Future{

      "youtube" +io.Source.fromURL("https://www.youtube.com").take(100).mkString
    }
    var page1 = Future{

      "google" +io.Source.fromURL("https://www.google.com").take(10000).mkString
    }

    val pages =List(page1,page2,page3)
    /*val firstPage = Future.firstCompletedOf(pages)
    firstPage.foreach(println)*/

    val allPages = Future.sequence(pages)
    allPages.foreach(println)
    Thread.sleep(5000)

  }


}

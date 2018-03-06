package week2
import java.util.Date

object PartiallyAppliedFunctions {

  def main(args: Array[String]): Unit = {

    val date = new Date()
    val logWithDateBound = log(date,_:String) //partially applied so to call same date with diff msg

    logWithDateBound("message1")
    Thread.sleep(1000)

    logWithDateBound("message2")
    Thread.sleep(1000)

    logWithDateBound("message3")
    Thread.sleep(1000)
  }


  def log(date: Date,message:String): Unit ={
    println(date +"----------" +message )
  }
}

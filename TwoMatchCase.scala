package week2

object TwoMatchCase {

  def main(args: Array[String]): Unit = {

    println(fizzBzz(30))

    def fizzBzz (i:Int)= {
      (i%3,i %2) match {
        case (0,0) => "fizzBuzz"
        case (0,_) => "fizz"
        case  (_,0) => "buzz"
        case _ => "Nothing"

      }

    }
  }

}

package week2

object PartialFuncts2 {

  def main(args: Array[String]): Unit = {
    val fraction = new PartialFunction[Int, Int] {
      def apply(d: Int) = 10 / d

      def isDefinedAt(d: Int) = d != 0


    }

    val x = fraction(2)
    print(x)

  }
}

package week2

object PartialFuncts {

  def main(args: Array[String]): Unit = {

val SquareRoot:PartialFunction[Double,Double]={

  case d:Double if d > 0 =>math.sqrt(d)
}

    val list:List[Double]= List(4,16,25,-9)

    val result = list.map(Math.sqrt)
    println(result)

  }
}

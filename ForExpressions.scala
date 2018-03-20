package week2

object ForExpressions {
  def main(args: Array[String]): Unit = {


    for {
          i <- 1 to 10
          j <- 1 to 200
       if j == i * i
    }yield (i,j)
  }
}

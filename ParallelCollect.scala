package week2

object ParallelCollect extends App {

  def fib(n:Int): Int = {
    if (n < 2) 1
    else
      fib(n - 1) + fib(n - 2)
    }

  for   (i<- 30 to 15 by -1){
    println(fib(i))
  }
}

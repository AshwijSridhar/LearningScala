package week2

class Hero1(a:Int) extends Bike1(a) {

  c = 30
  def run(): Unit ={

    println("running fine")
    println("a : "  +a)
    println("b  : "  +b)
    println("c : "  +c)
  }

}


object Hero1Object{
  def main(args: Array[String]): Unit = {
    var h = new Hero1(10)
    h.run()
    h.performance()
  }
}


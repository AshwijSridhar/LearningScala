package week2

class C extends B {

  def show() {

    println("salary "  +salary)
    println("bonus "    +bonus)
  }
}

object MultiLevel{

  def main(args: Array[String]): Unit = {

    var c = new C()
    c.show()
  }
}

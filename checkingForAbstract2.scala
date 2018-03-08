package week2

class checkingForAbstract2 extends CheckingForAbstract {
  def run(): Unit ={
    println("running fine")
  }

  }


object checkingForAbstract2Object {

  def main(args: Array[String]): Unit = {
    var s = new checkingForAbstract2()
    s.run()
  }
}

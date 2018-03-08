package week2

class Programmer extends Employee {

  var bonus:Int = 50000
  println("salary" +salary)
  println("bonus"   +bonus)


}


object ProgrammerObject{

  def main(args: Array[String]): Unit = {

    var programmer = new Programmer()
  }
}

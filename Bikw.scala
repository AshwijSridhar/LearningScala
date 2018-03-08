package week2

class Bike extends Vehicle {

  override def show(): Unit ={

    println("Bike is running")
  }

}


object BikeObject{

  def main(args: Array[String]): Unit = {
    var b = new Bike
    b.show()
  }
}

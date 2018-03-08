package week2

class CarDet extends CarDetails {

  import scala.io.Source

  override def Details(source: String): String ={
    Source.fromString(source).mkString
  }

}

object car{
  def main(args: Array[String]): Unit = {

    var c = new CarDet
    println(c.Details("Car details are being displayed"))
    println(c.isInstanceOf[CarDetails])
  }
}
package week2

case class CaseClassExample(a:Int,b:Int)

  object mainObject {

    def main(args: Array[String]): Unit = {

      var c = CaseClassExample(10, 20) // no need to use new to instantiate the object

      println("the value of a is :" + c.a)
      println("the value of b is :" + c.b)
    }
  }


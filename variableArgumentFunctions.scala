package week2

object variableArgumentFunctions {

  def main(args: Array[String]): Unit = {
    printStrings("Hello","there","I","am","new","to","scalworld")
  }

  /* here the type of args is of type Array[String] even though it is declared as String */
  def printStrings(args:String*)= {
    var i:Int = 0

    for (arg <- args){

      println("Arg value[" + i + "] = " + arg)

      i = i +1

    }
  }

}

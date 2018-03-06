package week2

object CurryingInScala {

  def main(args: Array[String]): Unit = {
    val str1:String = "Hello, "
    val str2:String = "Scala!"

    println( "str1 + str2 = " +  strcat(str1)(str2) )
  }

  def strcat(str: String)(str2:String) ={

    str+str2
  }

}

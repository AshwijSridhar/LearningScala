package week2

case class Person(name:String,age:Int) {

}


object someObject{
  def main(args: Array[String]): Unit = {

    val alice = new Person("Alice",25)
    val ashwij = new Person("Ashwij",24)
    val aneesh = new Person("Aneesh",25)

    for (person <- List(alice,ashwij,aneesh)){

      person match {

        case Person("Alice",25) => println("Hi Alice")
        case Person("Ashwij",24) => println("Hi Ashwij")
        case Person("Aneesh",25) => println("Hi Aneesh")
      }
    }

  }

}

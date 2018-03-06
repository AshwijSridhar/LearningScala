package week2

class Main {

  def sayHelloWorld: Unit ={

    println("hello world")
  }


}

object Main{

  def sayHi: Unit ={
    println("Hi")
  }

  var c = new Main
  c.sayHelloWorld
  Main.sayHi

}


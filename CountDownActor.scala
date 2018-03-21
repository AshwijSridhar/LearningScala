package week2

import akka.actor.Actor
import akka.actor.ActorRef
import akka.actor.Props



class CountDownActor extends App {
  case class StartCounting(n:Int,other:ActorRef)
  case class Countdown(n:Int)

  class CountDownActor extends Actor{

    def receive ={

      case StartCounting(n,other) =>
        println(n)
        other ! Countdown(n-1)

      case Countdown(n) =>
        if(n>0){
          println(n)
          sender ! = Countdown(n-1)
        }
        else{
          context.system.terminate()
        }
    }

    def foo = println("normal method")
  }

  val system = ActorSystem("CountdownSystem")
  val actor1 = system.actorof(Props[CountDownActor],"countDown1")
  val actor2 = system.actorof(Props[CountDownActor],"countDown2")

  actor1 ! StartCounting(10,actor2)

}

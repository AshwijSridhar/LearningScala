package week2

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

class simpleActor extends Actor {

  def receive = {
    case msg:String =>println(msg)
    case _ => println("unkown message")

  }

}

object simpleActorObject{
  def main(args: Array[String]): Unit = {

    var actorSystem = ActorSystem("actor system")
    var actor = actorSystem.actorOf(propsOf[HelloAkka], "Hello ")
    actor ! "Hello akka"
    actor ! 100.52
  }

}

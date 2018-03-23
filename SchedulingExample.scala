package week2

import akka.actor.{Actor, ActorSystem, Props}
import scala.concurrent.duration._

object SchedulingExample extends App{
  case object Count

  class scheduleActor extends Actor{

    var n = 0
    def receive ={

      case Count =>
        n+=1
        println(n)

    }
  }

  val system = ActorSystem("SchedulingSystem")
  val actor = system.actorOf(Props[scheduleActor],"ScheduleActor")
  implicit val ec = system.dispatcher

  actor ! Count
  system.scheduler.scheduleOnce(1.second)(actor ! Count) //schedules once
  system.scheduler.schedule(0.second,100.millis,actor,Count) // schedules from 2


  Thread.sleep(2000)
  system.terminate()
}

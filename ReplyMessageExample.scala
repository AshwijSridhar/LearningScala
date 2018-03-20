package week2
import scala.actor._

class ReplyMessageExample extends Actor {

   def receive ={
     case message:String => println("message received from " +sender.path.name +"message" +message )
       val child  = context.Actor(Props[ReplyMessageExample],"Actor Child")
       child ! Hello Child

   }

 class ReplyChildMessageExample extends Actor{
   def receive ={
     case message:String => println("message received from "  +sender.path.name +"message" +message)
     println("Replying to" +sender().path.name )
       sender() ! "I got your message"
   }

 }


  object mainObject{

    def main(args: Array[String]): Unit = {
      val actorSystem = ActorSystem("ActorSystem");
      val actor = actorSystem.actorOf(Props[ActorReplyExample], "RootActor");
      actor ! "Hello";
    }
  }



}

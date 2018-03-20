package week2

class ActorForward extends Actor{

  def receive ={

  case message:String => println("Message received  " +message)
      val child = context.actorOf(Props[Actor2],"child actor")
      case _ => println("unknown message")

  }

  override def postStop(): Unit ={
      println("actor stopped")
  }
}


object MainObject{

  def main(args: Array[String]): Unit = {
    val actorSystem = ActorSystem("ActorSystem")
    val actor  = actorSystem.actor(Props[ActorExample],"RootActor")
    actor ! "Hello"
    actorSystem.stop("actor")
  }
}


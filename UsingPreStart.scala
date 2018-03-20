package week2

class UsingPreStart extends Actor{

  def receive ={

    case msg:String => println(msg +self.path.name)
      var a:Int =  10/0; // arithmetic exception has occured
  }

  override def postRestart(reason:Throwable){    // Overriding preRestart method
    println("preRestart method is called");
    println("Reason: "+reason)
  }

}

object MainObject{

  def main(args: Array[String]): Unit = {
    var actorSystem = ActorSystem("ActorSystem")
    val actor = actorSystem.actor(Props[UsingPreStart],"RootActor")

    implicit val timeout = Timeout(2 seconds);
    val future = actor ? "Hello";
    val result = Await.result(future, timeout.duration);
    println(result);


  }
}

package week2

class RootActor extends Actor{

  def receive ={
    case msg:String => println(msg + " " +self.path.name)
      var child actor  = context.actorOf(Props[Child],"Child")
      childActor ! "Hello"

  }

}

class Child extends Actor{
  def receive = {
    case msg : String => println(msg +" " +self.path.name )
  }
}

object ChildActorExample {
  def main(args: Array[String]): Unit = {
    var actorSystem = ActorSystem()
    var actor = actorSystem.actorOf(props[RootActor],"RootActor")
    actor ! "Hello"
  }
}

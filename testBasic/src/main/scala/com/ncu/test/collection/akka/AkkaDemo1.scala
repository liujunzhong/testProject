package com.ncu.test.collection.akka

import akka.actor.{Actor, ActorRef, ActorSystem, Props}


/**
 * @Author ljz
 * @Date 2019/12/18 17:08
 * @Version 1.0
 **/
class AkkaDemo1 extends Actor{
  override def receive: Receive = {
    case "hello" => println("receive hello response hello too :)")
    case "hi" => println("receive hi response hi too")
    case "exit" => {
      println("receive exit")
      context.stop(self)
      context.system.terminate()
    }
    case _ => print("don't match")
  }
}

object SayHelloDemo{
  private val actorFactor = ActorSystem("actorFactor")
  private val aActor: ActorRef = actorFactor.actorOf(Props[AkkaDemo1],"aActor")

  def main(args: Array[String]): Unit = {
    aActor ! "hello"
    aActor ! "hi"
    aActor ! "hell"
    aActor ! "exit"

  }
}

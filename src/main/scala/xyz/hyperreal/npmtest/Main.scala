package xyz.hyperreal.npmtest

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

object Main extends App {

  val hello = new HelloWorld

  hello.sayHello()

}

@JSExportTopLevel("HelloWorld")
class HelloWorld {

  @JSExport
  def sayHello(): Unit = {
    println("hello world from Scala.js")
  }

}

package xyz.hyperreal.npmtest

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

object Main extends App {}

@JSExportTopLevel("HelloWorld")
class HelloWorld {

  @JSExport
  def sayHello(): Unit = {
    println("hello from Scala.js")
  }

}

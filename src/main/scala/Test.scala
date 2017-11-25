package test

import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object One {
  val one = "hello"
  def main(args: Array[String]): Unit = {
    println("HELLOOOOOOO")
    println("the answer is: " ++ square(2).toString)
    println("the second answer is: " ++ halve(22).toString)
  }

  def square(x: Int): Int = {
    x * x
  }

  def halve(x: Double): Double = {
    x/2.0
  }
}


object Two {
  val two: String = "2"

  {
    implicit def int2str(i: Int): String = i.toString
    val twotwo: String = 3
  }
}

object Three {
  val three = 3
}

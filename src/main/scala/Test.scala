package test

object One {
  val one = "hello"
  def main(args: Array[String]): Unit = {
    println("HELLOOOOOOO")
    println("the answer is: " ++ square(2).toString)
  }

  def square(x: Int): Int = {
    x * x
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

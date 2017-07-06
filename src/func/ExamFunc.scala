package func

import java.util.logging.Logger


/**
  * Created by sandr on 05.06.2017.
  */
object ExamFunc {
  val log = Logger.getLogger("ExamFunc")

  def main(args: Array[String]): Unit = {
    log.info("Me here!")

    val next = addOne(3)
    log.info(next.toString)

    //function as Object
    val functObject = addOne _
    functObject(7)
    functObject.apply(8)

    val anonymFunction = (x:Int) => x + 1
    anonymFunction(10)

  }

  def addOne(x: Int) = x + 1

}

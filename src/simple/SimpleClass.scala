package simple

/**
  * Created by sandr on 05.06.2017.
  */
class SimpleClass(calcFunc: Function1[Int, Int]) {
  def calculate: (Int) => Int = {
    calcFunc
  }
}

//val plus1: Function1[Int, Int] = new Function1[Int, Int] {
//def apply(x: Int): Int = x + 1
//}
//plus1.apply(2)
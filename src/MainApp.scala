import simple.SimpleClass

/**
  * Created by sandr on 28.05.2017.
  */
object MainApp {
  def main(args: Array[String]): Unit = {
    System.out.println("Me Here !")

    //TODO
    //chanhes 1 in master branch
    //some changes in master
    //Created branch Test17

    //Done only local commit  to /Test17

    //merged it seems locally

 //   val simpleClass = {
//      new SimpleClass(addCalc(5, 7))
//    }


    var constructorsExample = new ConstructorsExample("This is parameter to instance.")
    constructorsExample.insatnceMethod1()

    ConstructorsExample("use simple constructor")

    ConstructorsExample("Paramert 1", 123456)

    ConstructorsExample("Paramert 1").st
  }


  def print(line:String): Unit ={
    System.out.println(line)
  }

  def addCalc(x:Int, y:Int): Int = {
    x + y
  }

  //This is branch Test17_patch
}

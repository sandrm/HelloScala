/**
  * Created by sandr on 05.06.2017.
  */
class ConstructorsExample(anyParam:String) {
  val instanceField: String = "This is value of instance field"

  def insatnceMethod1(): Unit ={
    MainApp.print(instanceField + " " + anyParam)
  }

}

object ConstructorsExample{
  val staticField = "This is static field"
  var anyTextInner = ""

  def staticMethod(): Unit ={
    MainApp.print(s"This is static method called: $anyTextInner")
  }

  def apply(anyText:String) = {
    MainApp.print(s"This is simple constructor, get parameter $anyText")
    anyTextInner = anyText
  }

  def apply(anyText:String, anyNumber: Int) = {
    MainApp.print(s"This is overriden constructor - parameters: $anyText $anyNumber")
  }

}

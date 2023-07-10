import scala.io.StdIn._
object Q4 extends App {
  def isOdd(n: Int):Boolean={!isEven(n)}
  def isEven(n:Int):Boolean={
    n match {
      case 0 => true
      case _ => isOdd(n-1)
    }
  }

  var num = readLine("Enter a number: ").toInt

  println("Is this number is even: "+isEven(num))
}

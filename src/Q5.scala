import scala.io.StdIn._
object Q5 extends App {
  def isOdd(n: Int):Boolean={!isEven(n)}
  def isEven(n:Int):Boolean={
    n match {
      case 0 => true
      case _ => isOdd(n-1)
    }
  }

  def printEve(x:Int): Unit = {
    if(x==0){
//      println(x)
    }
    else {
      printEve(x-1)
    }
    if(isEven(x)){
      println(x)
    }
  }

  var num = readLine("Enter a number: ").toInt

  println("this is even numbers until "+num)
  printEve(num)
}

import scala.io.StdIn._
object Q6 extends App {
  var fibNum:Array[Int] = new Array[Int](num)

  def fibbonacci(n: Int): Int = n match {
    case 0 => 0
    case x if x == 1 => 1
    case _ => fibbonacci(n - 1) + fibbonacci(n - 2)
  }

  def fibSeq(n: Int): Unit = {
    if (n > 0){
      fibSeq(n - 1)
    }
    println(fibbonacci(n))
  }


  var num = readLine("Enter a number: ").toInt

  println("this is fibonacci numbers until "+num)
  fibSeq(num)
}

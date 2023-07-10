import scala.io.StdIn._
object Q3 extends App{
  def sum(n:Int):Int={
    if(n>1){
      n+sum(n-1)
    }
    else {
      n
    }
  }

  var num = readLine("Enter the number : ").toInt
  println(sum(num))
}

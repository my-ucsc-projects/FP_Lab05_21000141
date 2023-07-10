import scala.io.StdIn._
object Q2 extends App{
  def gcd(a: Int, b: Int): Int = a match {
    case a if (a == 0) => b
    case _ => gcd(b % a, a)
  }

  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if (p == x) => true
    case x if gcd(p, x) > 1 => false
    case x => prime(p, x + 1)
  }

  def primeSeq(n:Int): Unit = {
    if(n>1){
      if(prime(n)){
        println(n)
      }
      primeSeq(n-1)
    }
  }

  val num = readLine().toInt
  println("prime numbers till "+num)
  primeSeq(num)
}

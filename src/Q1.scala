import scala.io.StdIn._
object Q1 extends App{
  def gcd(a: Int, b: Int): Int = a match {
    case a if (a == 0) => b
    case _ => gcd(b % a, a)
  }

  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if (p == x) => true
    case x if gcd(p, x) > 1 => false
    case x => prime(p, x + 1)
  }

  val num = readLine().toInt
  print(prime(num))
}

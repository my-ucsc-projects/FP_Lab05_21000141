import scala.io.StdIn._
object Main {
  def main(args: Array[String]): Unit = {
  //    println("Hello world!")
  //
  //    def gcd(n: Int, m: Int): Int = {
  //      n match {
  //        case x if (x == 0) => m
  //        case _ => gcd(m % n, n)
  //      }
  //    }
  //
  //    def prime(n: Int, m: Int = 2): Boolean = {
  //      n match {
  //        case x if (x == 2) => true
  //        case x if (gcd(n, m) > 1) => false
  //        case x => prime(n, m + 1)
  //      }
  //    }
  //
  //    print(prime(5))
  //  }
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

}
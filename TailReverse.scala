import scala.annotation.tailrec

object TailRecursion {
  def tailRecFactorial(res0: Int, res1: Int): Unit = {
    def factorial(n: Int): Int = {
      @tailrec
      def iter(x: Int, result: Int): Int =
        if (x == res0) result
        else iter(x - 1, result * x)

      iter(n, res1)
    }

    factorial(3) shouldBe 6
    factorial(4) shouldBe 24
  }
}
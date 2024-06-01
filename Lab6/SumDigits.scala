object SumDigits {
    def sumDigits(n: Double): Int = {
        n.toString.replace(".", "").split("").map(_.toInt).sum
    }
    def main(args: Array[String]): Unit = {
        var x = sumDigits(135.5)
        println(x)
      }
}
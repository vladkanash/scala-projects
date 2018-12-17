import StringDecimal.DefaultStringNumeric._

object Main extends App {

  override def main(args: Array[String]): Unit = {
    print(calculatePi(50))
  }

  def calculatePi(limit: Int, n: Int = 1, current: Double = 2, sum: Double = 2): Double = {
    if (n == limit) sum
    else {
      val newCurrent = (current * n) / (2 * n + 1)
      calculatePi(limit, n + 1, newCurrent, sum + newCurrent)
    }
  }
}

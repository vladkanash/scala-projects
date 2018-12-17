trait StringNumeric extends Numeric[StringDecimal] {

  override def plus(x: StringDecimal, y: StringDecimal): StringDecimal = {
    val xval = x.value.reverse
    val yval = y.value.reverse

    var add = 0
    val result = xval.zipAll(yval, '0', '0')
      .map(c => (c._1.asDigit, c._2.asDigit))
      .map(c => {
        val res = c._1 + c._2 + add
        if (res > 9) {
          add = res / 10
          (res % 10 + 48).toChar
        } else {
          add = 0
          (res + 48).toChar
        }
      }).reverse.mkString
    if (add > 0) StringDecimal((add + 48).toChar + result) else StringDecimal(result)
  }

  override def minus(x: StringDecimal, y: StringDecimal): StringDecimal = ???

  override def times(x: StringDecimal, y: StringDecimal): StringDecimal = ???

  override def negate(x: StringDecimal): StringDecimal = ???

  override def fromInt(x: Int): StringDecimal = ???

  override def toInt(x: StringDecimal): Int = ???

  override def toLong(x: StringDecimal): Long = ???

  override def toFloat(x: StringDecimal): Float = ???

  override def toDouble(x: StringDecimal): Double = ???

  override def compare(x: StringDecimal, y: StringDecimal): Int = ???
}

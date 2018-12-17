class StringDecimal(val value: String) {

  override def toString: String = value
}

object StringDecimal {
  def apply(value: String): StringDecimal = {
    new StringDecimal(value)
  }

  implicit object DefaultStringNumeric extends StringNumeric
}

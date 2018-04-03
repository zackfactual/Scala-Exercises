object Hello {
  def main(args:Array[String]) {
    val name:String = args(0)
    println("Hello " + name + "!")
  }
}

import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._
// values incl. ENGLISH, CANADA, CANADA_FRENCH, CHINA, FRANCE, GERMAN, ITALIAN, JAPAN, KOREA, UK, etc.

object PrintDate {
  def main(args:Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.ITALIAN)
    println(df.format(now))
  }
}
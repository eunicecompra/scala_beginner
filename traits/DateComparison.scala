trait Ord {
  def < (that: Any): Boolean
  def <=(that: Any): Boolean = (this < that) || (this == that) 
  def > (that: Any): Boolean = !(this <= that)
  def >=(that: Any): Boolean = !(this < that)
}

class Date(y: Int, m: Int, d: Int) extends Ord {
  def year = y
  def month = m
  def day = d

  override def toString(): String = s"$year-$month-$day"

  override def equals(that: Any): Boolean = 
    that.isInstanceOf[Date] && {
      val o = that.asInstanceOf[Date]
      o.year == year && o.month == month && o.day == day
  }

  def <(that: Any): Boolean = {
    if (!that.isInstanceOf[Date])
      sys.error("cannot compare " + that + " and a Date")

    val o = that.asInstanceOf[Date]
    (year < o.year) ||
    (year == o.year && (month < o.month ||
                       (month == o.month && day < o.day)))

  }
}

object DateComparison {
  def main(args: Array[String]): Unit = {
    def date1 = new Date(2020, 3, 27)
    def date2 = new Date(2020, 6, 1)
    println(s"Date1 = $date1")
    println(s"Date2 = $date2")
    println(s"Date1 < Date2: ${date1 < date2}")
    println(s"Date1 <= Date2: ${date1 <= date2}")
    println(s"Date1 > Date2: ${date1 > date2}")
    println(s"Date1 >= Date2: ${date1 >= date2}")
  }
}

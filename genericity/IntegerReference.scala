class Reference[T] {
  private var contents: T = _
  def set(value: T): Unit = { contents = value}
  def get: T = contents
}

object IntegerReference {
  def main(args: Array[String]): Unit = {
    val cell = new Reference[Int]
    cell set 25
    println(s"The cell contains the half of ${cell.get * 2}.")
  }
}

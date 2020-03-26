object ComplexNumbers {
  def main(args: Array[String]): Unit = {
    var real = 1.2
    var imaginary = 3.4
    if (args.length >= 2) {
      real = args(0).toDouble
      imaginary = args(1).toDouble
    }
    val c = new Complex(real, imaginary)
    println("Overriden toString: " + c.toString)
  }
}



object Timer {
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback();
      Thread sleep 1000
    }
  }

  def timeFlies(): Unit = {
    println("Time flies like a bird...")
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(timeFlies)
  }
}

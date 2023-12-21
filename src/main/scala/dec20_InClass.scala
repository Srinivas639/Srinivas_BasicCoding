
//Pattern Related Programs
object Pattern{
  def main(args: Array[String]): Unit = {
    var num=1
    for(i <- 1 to 5){
      for(j <- 1 to i){
        print(s"$num ")
        num = num+1
      }
      println()
    }
  }
}

object NumberPattern {
  def main(args: Array[String]): Unit = {

    for (i <- 6 to 1 by -1) {
      for (j <- 1 to i) {
        print(s"$j ")
      }
      println()
    }
  }
}

object NumberPattern3 {
  def main(args: Array[String]): Unit = {

    for (i <- 6 to 1  by -1) {
      for (j <- 1 to i) {
        print(s"$i ")
      }
      println()
    }
  }
}

object NumberPattern6 {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 6) {
      for (j <- 1 to i) {
        print(s"$i ")
      }
      println()
    }
  }
}


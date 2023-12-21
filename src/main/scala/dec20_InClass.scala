
//Pattern Related Programs
object Pattern1{
  def main(args: Array[String]): Unit = {
    var num=1
    for(i <- 1 to 6){
      for(j <- 1 to i){
        print(s"$num ")
        num = num+1
      }
      println()
    }
  }
}

object Pattern2 {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 6) {
      for (j <- 1 to i) {
        print(s"$j ")
      }
      println()
    }
  }
}

object Pattern3 {
  def main(args: Array[String]): Unit = {

    for (i <- 6 to 1 by -1) {
      for (j <- 1 to i) {
        print(s"$j ")
      }
      println()
    }
  }
}

object Pattern4 {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 6) {
      for (j <- 1 to i) {
        print(s"$i ")
      }
      println()
    }
  }
}

object Pattern5 {
  def main(args: Array[String]): Unit = {

    for (i <- 6 to 1  by -1) {
      for (j <- 1 to i) {
        print(s"$i ")
      }
      println()
    }
  }
}



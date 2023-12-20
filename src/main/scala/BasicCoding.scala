//1. Write a program to convert kg to g. (Input 56kg print in grams)
object Kg_grams {
  def main(args: Array[String]): Unit= {
    val Kg = 56.0
    val G = Kg * 1000.0
    println(s"$Kg kg is equal to $G grams.")
  }

}

//2. Write a program to covert temperature from degree C to F. (Input 80C)
//(80°C × 9/5) + 32 = 176°F
object CToF {
  def main(args: Array[String]): Unit= {
    val C = 80
    val F = (C * 9 / 5) + 32
    println(s"$C degree Celcius is equal to $F degree Foreignheit.")
  }

}

//3. Declare and initialize 3 three variable and print the biggest number.
object BiggestNumber {
  def main(args: Array[String]): Unit= {
    val a = 100
    val b = 200
    val c = 300
    val BNumber = if(a>b & a>c) a
    else if(b>a & b>c) b
    else c

    println("The biggest number is:" +BNumber)
  }

}


//4. Write a java program that performs the following tasks.
//a. Store a number in a variable
//b. If value is not in range (100-1000) prints wrong number else follows
//the steps
//c. Check even or odd
//d. If even divide the number by 3 and print the remainder
//e. If odd divide the number by 2 and print the remainder.

object EvenandOdd {
  def main(args: Array[String]): Unit = {

    var a = 446

    if (a < 100 || a > 1000) {
      println("Wrong number!")
    }
    else {
      if (a % 2 == 0) {
        val remainder = a % 3
        println(s"The number $a is even. Remainder after dividing by 3: $remainder")
      } else {
        val remainder = a % 2
        println(s"The number $a is odd. Remainder after dividing by 2: $remainder")
      }
    }
  }
}

//5. Declare & initialize a number. Check whether the number is in range 0-100
//or not. If not in range print invalid input. Else – if the number is in range 90-
//100 then print Super Smart, 80-90 print Smart,70-80 print smart enough,
//60-70 print just smart, 35-60 print no smart, 0-35 print dump.

object NumberRange {
  def main(args: Array[String]): Unit = {
    val a = 95

    if (a >= 0 & a <= 100) {

      if (a >= 90 & a <= 100) {
        println("Super Smart")
      }
      else if (a >= 80 & a <= 90) {
        println("Smart")
      }
      else if (a >= 70 & a <= 80) {
        println("Smart enough")
      }
      else if (a >= 60 & a <= 70) {
        println("just smart")
      }
      else if (a >= 35 & a <= 60) {
        println("no smart")
      }
      else {
        println("dump")
      }
    }
      else {
        println("invalid input")
      }
    }
  }


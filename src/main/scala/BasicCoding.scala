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

//6. Write a program to perform simple math based on the user inputs by using
//Switch condition.(+ , - , * , /)

object SimpleMath {
  def main(args: Array[String]): Unit = {

    print("Enter the first number: ")
    val i = scala.io.StdIn.readDouble()

    print("Enter the second number: ")
    val j = scala.io.StdIn.readDouble()

    print("Enter the operator (+, -, *, /): ")
    val operator = scala.io.StdIn.readLine()

    // Perform calculation based on the operator using a match expression
    val result = operator match {
      case "+" => i + j
      case "-" => i - j
      case "*" => i * j
      case "/" =>
        if (j != 0) i / j
        else "Error: Division by zero"
      case _ => "Invalid operator"
    }

    // Display the result
    println(s"Result: $result")
  }
}
//7. Write a program to print “SEEKHO BIGDATA”for 60 times.
object RepeatString {
  def main(args: Array[String]): Unit = {
    for (_ <- 1 to 60) {
      println("SEEKHO BIGDATA")
    }
  }
}

//8. Write a program to print all numbers which are divisible by 11 from 250 to
//550.
object DivisibleBy11 {
  def main(args: Array[String]): Unit = {
    for (a <- 250 to 550) {
      if (a % 11 == 0) {
        println(a)
      }
    }
  }
}

//9. Write a program to sum all the numbers from 56 to 153.
object SumNumbersInRange {
  def main(args: Array[String]): Unit = {
    val start = 56
    val end = 153

    val sum = (start to end).sum

    // Display the result
    println(s"The sum of numbers from $start to $end is: $sum")
  }
}

//10. Write a program to print all even numbers in range 700 to 900.
object EvenNumbersInRange {
  def main(args: Array[String]): Unit = {
    for (x <- 700 to 900) {
      if(x % 2 == 0)
        println(x)
    }
  }
}

//11. Write a program to print all odd numbers from 251 to 51. like (251,
//249,...51)
object OddNumbersDescending {
  def main(args: Array[String]): Unit = {
    for (a <- (251 to 51 by -2).filter(_ % 2 != 0)) {
      println(a)
    }
  }
}

//12. Write a Program to print the count of the even numbers between the given
//range?
object CountEvenNumbers {
  def main(args: Array[String]): Unit = {

    val start = 100
    val end = 200

    val evenCount = (start to end).count(_ % 2 == 0)
    println(s"The count of even numbers between $start and $end is: $evenCount")
  }
}

//13. Write a program to print alternate even numbers from 20 to 140. Like
//(20,24,28...)
object AlternateEvenNumbers {
  def main(args: Array[String]): Unit = {
    for (a <- (20 to 140 by 4)) {
      println(a)
    }
  }
}

//14. Write a program to print alternate even numbers from 20 to 140. Like
//(22,26,30...)
object AltEvenNumbers {
  def main(args: Array[String]): Unit = {
    for (number <- (22 to 140 by 4)) {
      println(number)
    }
  }
}

//15. Print following series 2*3,3*4,4*5,......16*17 (Print in two ways – patter
//& multiplied value)
object SeriesPrinting {
  def main(args: Array[String]): Unit = {
    // Print the series in pattern format
    print("Pattern: ")
    for (i <- 2 to 16) {
      print(s"$i*${i + 1} ")

    }
    println("\n")

    // Print the series with multiplied values
    print("Multiplied Values: ")
    for (i <- 2 to 16) {
      print(s"${i * (i + 1)} ")

    }
  }
}

//16. Write a program to sum all even numbers between 382 and 582.
object SumEvenNumbers {
  def main(args: Array[String]): Unit = {

    val start = 264
    val end = 495

    val sum = (start to end).filter(_ % 2 == 0).sum
    println(s"The sum of even numbers between $start and $end is: $sum")
  }
}

//17. Write a Program to print the all alphabets by using character Variable?
object PrintAlphabets {
  def main(args: Array[String]): Unit = {

    for (ch <- 'A' to 'Z') {
      print(s"$ch ")
    }
    println()
    for (ch <- 'a' to 'z') {
      print(s"$ch ")
    }
  }
}

//18. Write a program to find the average of 24,26,28,.....100.
object AverageCalculator {
  def main(args: Array[String]): Unit = {

    val start = 24
    val end = 100

    val count = (start to end by 2).length
    val sum = (start to end by 2).sum
    val average = sum.toDouble / count

    println(s"The average of numbers from $start to $end is: $average")
  }
}

//19. Write programs to sum of the following Series. 52 + 62 + 72
//+..........+1022.
object SumofSeries{
  def main(args: Array[String]) : Unit = {
    val start = 52
    val end = 1022

    val sum = (start to end).sum
    println(s"The sum of the following series from $start to $end is: $sum")
  }
}

//20. Write a program to print A, B alternatively for 100 times. Ex: (A, B, A, B,
//A,B...)
object Alternatives{
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 100) {
      print("A, B")
      if (i < 100) {
        print(", ")
      }
    }
  }
}

//21. Write a program to print the series : 10@9,9@8,8@7.......-5@-6
object PrintSeries {
  def main(args: Array[String]): Unit = {
    for (i <- 10 to -5 by -1) {
      print(s"$i@${i - 1}")
      if (i > -5) {
        print(",")
      }
    }
  }
}

//22. Write programs to print the following series. 100,200,300........10000
object Seriesof100{
  def main(args: Array[String]): Unit= {
    for(i <- 100 to 10000 by 100){
      print(s"$i")
      if(i<10000){
        print(",")
      }
    }
  }
}

//23. Write programs to print the following series. 5^2, 7^2,9^2.....25^2
object SeriesofCaret{
  def main(args: Array[String]): Unit= {
    for(i <- 5 to 25 by 2){
      print(s"$i^2")

      if(i<25){
        print(", ")
      }
    }
  }
}

//24. Write programs to print the following series. 5,10,5,10,5,10,5 for 7 times
object RepeatSeries{
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 7){
      print("5,10")

      if(i<7){
        print(",")
      }
    }
  }
}

//25. Write programs to print the following series. 5*4,5*3,5*2,......5*(-12)
//(Print in two ways – patter & multiplied value)
object SeriesMultiplied{
  def main(args: Array[String]): Unit = {

   print("Pattern: ")
    for(i <- 4 to (-12) by -1){
      print(s"5*$i")

      if(i > -12){
        print(",")
      }
    }
    print("\n")

    print("Multiplied Values: ")
    for(i <- 4 to (-12) by -1){
      print(5 * i)

      if(i > -12){
        print(",")
      }
    }
    println()
  }
}

//26. Write programs to print the following series.
//1,even,3,even,5,even,.......35,even
object NumbersandEven{
  def main(args: Array[String]): Unit ={
    for(i <- 1 to 35 by 2){
      if(i % 2 != 0){
        print(s"$i,even")
      }
      if(i < 35){
        print(",")
      }
    }
  }
}

//27. Write programs to print the following series. 1,2,factor of three,4,5,factor
//of three, 7,8,factor of three,..........22,23,factor of three.
object NumbersandFactorofThree{
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 24){
      if (i % 3 == 0) {
        print("factor of three")
        if(i < 24){
          print(", ")
        }
      } else {
        print(s"$i,")
      }
    }
    println()
  }
}

//28. Write programs to print the following series. 1,3, divisible by five, 7,9,
//11,13, divisible by five,.....21,23, divisible by five
object CustomSeries {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 25 by 2) {
      if (i % 5 == 0) {
        print(" divisible by five")
        if (i < 24) {
          print(", ")
        }
      } else {
        print(s"$i,")
      }
    }
  }
}

//29. Write programs to print the following series. 0.5^2, 0.7^2,0.9^2....5.1^2
object SeriesofDecimalCaret1 {
  def main(args: Array[String]): Unit = {
    for (i <- 0.5 to 5.1 by 0.2) {
      val result = math.pow(i, 2)
      print(f"$i%.1f^2")

      if (i < 5.1) {
        print(", ")
      }
    }
  }
}

//30. Write a for loop that never ends?
object InfiniteLoop {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to Int.MaxValue) {
      println("This loop that never ends!")
    }
  }
}

//31. Write a Loop inside other loop and observe the execution flow?
object NestedLoop {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3) {
      println("Outer loop: i = " + i)

      for (j <- 1 to 2) {
        println("  Inner loop: j = " + j)
      }
    }
  }
}

//Pattern
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
























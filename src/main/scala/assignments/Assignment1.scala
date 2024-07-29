import scala.::
import scala.util.Random
object Exercise1 {
    def main(args: Array[String]): Unit = {
        //val ARRAY = Array(0, 1, 2, 3, 4, 5)
        // Converting a List to an Array
        val list = List(0, 1, 2, 3, 4, 5)
        val ARRAY = list.toArray
    
        for (i <- 0 until ARRAY.length) {
            println(ARRAY(i))
        }
        println("\n")
    }
}
object Exercise4 {
  def main(args: Array[String]): Unit = {
    val numbers = Array(1, 2, 3, 4, 5)
    // Filter
    val even = numbers.filter(_ % 2 == 0)
    println("Even numbers: " + even.mkString(", "))
    // Map
    val doubled = numbers.map(_ * 2)
    println("Doubled numbers: " + doubled.mkString(", "))
    // Reduce
    val sum = numbers.reduce(_ + _)
    println("Sum of numbers: " + sum)
  }
}

object Task1 {
  def main(args: Array[String]): Unit = {
    val randomInt = Seq.fill(15)(50 + Random.nextInt(450))
    val primes = randomInt.filter(isPrime)
    val sortedPrimes = primes.sorted
    val primeMap = sortedPrimes.map(x => randomInt.indexOf(x) -> x).toMap

    println("Random Integers: " + randomInt)
    println("Prime Map: " + primeMap)
  }

  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 until Math.sqrt(n).toInt + 1).exists(x => n % x == 0)
  }
}
object Task2 {
  def main(args: Array[String]): Unit = {
    val startAscii = 98 // ASCII code of 'b'
    val result = charArray(startAscii)
    println(result)
  }
  def charArray(start: Int): List[Char] = {
    def helper(current: Int, end: Int, acc: List[Char]): List[Char] = {
      if (current > end) 
      acc
      else 
      helper(current + 1, end, acc :+ current.toChar)
    }
    helper(start, 122, List.empty[Char]) // 122 is the ASCII value for 'z'
  }
}
object Task3 {
  def elementWiseSum(array1: Array[Double], array2: Array[Double]): Array[Double] = {
    (array1 zip array2).map { case (a, b) => a + b }
  }

  def main(args: Array[String]): Unit = {
    val array1 = Array(1.0, 2.0, 3.0)
    val array2 = Array(4.0, 5.0, 6.0)
    val result = elementWiseSum(array1, array2)
    println(s"Element-wise Sum: ${result.mkString(", ")}")
  }
}




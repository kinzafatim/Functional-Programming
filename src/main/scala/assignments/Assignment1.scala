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
import scala.collection.mutable.Set
import scala.collection.mutable.Map
object Exercise2{
  def main(args: Array[String]): Unit = {
    val mutableSet = Set(1, 2, 3)
    println("Initial Set: " + mutableSet)
    mutableSet += 4
    println("After adding 4: " + mutableSet)

    mutableSet -= 2
    println("After removing 2: " + mutableSet)

    println("Contains 3: " + mutableSet.contains(3)) // check if it conatains 3 or not
    println("Contains 5: " + mutableSet.contains(5))
    println("\n")
    val mutableMap = Map("one" -> 1, "two" -> 2) // key -> value
    println("Initial Map: " + mutableMap)

    mutableMap += ("three" -> 3)
    println("After adding (three): " + mutableMap)

    mutableMap -= "two"
    println("After removing (two): " + mutableMap)

    mutableMap("one") = 11
    println("Updated value off (one): " + mutableMap)

    println("Value for key 'one': " + mutableMap("one"))
    println("Value for key 'three': " + mutableMap("three"))
    println("\n")

  }
}

object Exercise3{
  def greet(name: Option[String]): String = {
    name match {
      case Some(n) => ("Hello, " + n + ". How you doin'")
      case None => ("Hello, Stranger!")
    }
  }
  def main(args: Array[String]): Unit = {
    val someName: Option[String] = Some("Kinza")
    val noName: Option[String] = None

    println(greet(someName))
    //println(greet(noName))
  }
}

object Exercise4 {
  def main(args: Array[String]): Unit = {
    val numbers = Array(1, 2, 3, 4, 5)
    // Filter
    val even = numbers.filter(_ % 2 == 0)
    println("Even no: " + even.mkString(", "))
    // Map
    val doubled = numbers.map(_ * 2)
    println("Doubled no: " + doubled.mkString(", "))
    // Reduce
    val sum = numbers.reduce(_ + _)
    println("Sum : " + sum)
  }
}



object Task1 {
  def main(args: Array[String]): Unit = {
    val randomInt = Seq.fill(15)(50 + Random.nextInt(450))
    val primes = randomInt.filter(isPrime)
    val sortedPrimes = primes.sorted
    val primeMap = sortedPrimes.map(x => randomInt.indexOf(x) -> x).toMap

    println("Random Integers: " + randomInt)
    println("Map: " + primeMap)
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
    helper(start, 122, List.empty[Char]) // 122 is the ASCII value= z
  }
}
object Task3 {
  def eSum(array1: Array[Double], array2: Array[Double]): Array[Double] = {
    (array1 zip array2).map { 
      case (a, b) => a + b 
    }
  }
  def main(args: Array[String]): Unit = {
    val array1 = Array(1.0, 2.0, 3.0)
    val array2 = Array(4.0, 5.0, 6.0)
    val result = eSum(array1, array2)
    println(s"Sum: ${result.mkString(", ")}")
  }
}

object Task4 {
  def evenR(arr: Array[Int]): Int = {
    def helper(index: Int, count: Int): Int = {
      if (index >= arr.length) 
      count
      else if 
      (arr(index) % 2 == 0) helper(index + 1, count + 1)
      else 
      helper(index + 1, count)
    }
    helper(0, 0)
  }

  def isEven(arr: Array[Int]): Int = {
    arr.count(_ % 2 == 0)
  }
  def main(args: Array[String]): Unit = {
    val largeArray = Array.fill(100)(Random.nextInt(100))
    println(s"Array:[ ${largeArray.mkString(", ")} ]")
    val ans = evenR(largeArray)
    println(s"No of even values recursive function: $ans")
    val answer = isEven(largeArray)
    println(s"No of even values count higher-order method: $answer")
  }
}

// object Task5 {
//   def buildMap[A, B](data: Seq[A], f: A => B): Map[B, A]{
//   }

//   def func(x: Int): Boolean = x % 2 == 0 // Check if the number is even

//   val lst = Seq(1, 2, 3, 4, 5)
//   println(buildMap(lst, func)) // Output the result of buildMap
// }


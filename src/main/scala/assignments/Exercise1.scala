// Write a Scala function named fib that recursively calculates the nth Fibonacci number 
//using tail recursion. The first two Fibonacci numbers are 0 and 1. def fib(n: Int): Int

import scala.::
import scala.util.Random

object Exercise1{
    def fib(n: Int): Int = {
        if (n <= 1) 
        n
        else {
        var a = 0 
        var b = 1

        var c = 0
        for (i <- 2 to n) {
            c = a + b
            a = b
            b = c
        }
        c
  }
}
    def main(args: Array[String]): Unit = {
        println(fib(9))
    }
}
// // Implement isSorted, which checks whether an Array[A] is sorted according to a
// // given comparison function:
// // def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean

// import scala.::
// import scala.util.Random

// object Exercise2 {
//   def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
//     val n = as.length
//     for (i <- 0 until n - 1) {
//       for (j <- 0 until n - i - 1) {
//         if (!ordered(as(j), as(j + 1))) {
//           return false
//         }
//       }
//     }
//     true
//   }

//   def main(args: Array[String]): Unit = {
//     val numbers = Array(5, 3, 4, 15, 6)
//     println(isSorted(numbers, (a: Int, b: Int) => a <= b))
//   }
// }

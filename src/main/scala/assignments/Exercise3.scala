// // Let’s look at another example, currying, which converts a function f of two arguments
// // into a function of one argument that partially applies f. Here again there’s only one
// // implementation that compiles. Write this implementation.
// // def curry[A,B,C](f: (A, B) => C): A => (B => C)


// import scala.::
// import scala.util.Random

// object Exercise3{
//     def curry[A,B,C](f: (A, B) => C): A => (B => C)= {
//         a => b => f(a, b)
// }

//     def main(args: Array[String]): Unit = {
//         def add(x: Int, y: Int): Int = x + y
//         val curriedAdd = curry(add)
//         val add5 = curriedAdd(5)
//         println(add5(3)) // Output: 8
//     }
// }
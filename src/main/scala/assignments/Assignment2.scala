import scala.math._

object ex1 {
    def main(args: Array[String]): Unit = {

    // ex1
        def calculate(x: Int)= {
        val a = 3
        val b = 5
        val c = 7
        val answer = a * pow(x, 2) + b * x + c
        answer
        }
        val list = List(-3, -2, -1, 0, 1, 2, 3)
        println("List: " + list.mkString(", "))
        println(list.map(x => calculate(x)))
        val anslist= list.map(x => calculate(x))
        println(anslist)
        
    // ex2
        val zipp= list zip anslist
        println("zipped lists" , zipp)
        val zippedindex = zipp.zipWithIndex
        println("Zipped with Index: ", zippedindex)


    // ex3
        def ex3(vector: List[Int]): Double = {
            sqrt(vector.map(x => x * x).sum)
            }

        val list1 = List(4, 6, 9, 4, 5, 6)
        println(s"Euclidean norm: ${ex3(list1)}")

    // ex
        println("")
        def apply[T](list: List[T]): Unit = {
            for (i <- list) {
                println(i)
                }
}
        val myList = List(1, 2, 3, 4, 5)
        apply(myList)


    // ex
    def addString[T, U](a: T, b: U): String = {
        (a.toString, b.toString) match {
        case (strA, strB) => strA + strB
        case _ => "Error!! Error!! Error!! failed"
        }
}
    val A = "22SP-032-CS"
    val B = "hello"
    println(addString(A, B))

}
}

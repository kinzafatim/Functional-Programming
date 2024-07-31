import scala.collection.mutable.Map

object Wildcard {
    // 11.2
    def main(args: Array[String]): Unit = {

        val ulist = List(1, 2, 3, 4, 5)
        val ulistTwice = ulist.map(_ * 2) // Wildcard for x
        println("List elements doubled: " + ulistTwice)
        
        def f(x: Int): Option[Int] = if (x > 2) Some(x * x) else None
        val ulistSquared = ulist.map(f(_)) // Wildcard for x
        println("List elements squared selectively: " + ulistSquared)

        // 11.3
        val ulist1 = List(1, 2, 3, 4, 5)
        def g(v: Int) = List(v - 1, v, v + 1)

        val ulistExtended = ulist1.map(g(_)) // Wildcard for x
        println("Extended list using map: " + ulistExtended)

        val ulistExtendedFlatMap = ulist1.flatMap(g(_)) // Wildcard for x
        println("Extended list using flatMap: " + ulistExtendedFlatMap)

        // 11.4
        val ulist2 = List(1, 2, 3, 4, 5)
        def fun(x: Int): Option[Int] = if (x > 2) Some(x) else None

        val ulist_selective = ulist2.map(fun(_)) // Wildcard for x
        println(s"Selective elements of List with map: $ulist_selective")
        
        val ulist_selective_flatMap = ulist.flatMap(fun(_)) // Wildcard for x
        println(s"Selective elements of List with flatMap: $ulist_selective_flatMap")

        // 11.5
        val uMap = Map('a' -> 2, 'b' -> 4, 'c' -> 6)
        val uMap_mapValues = uMap.map { case (k, v) => (k, v * 2) }
        println(s"Map values doubled using map = $uMap_mapValues")
        
        def h(k: Char, v: Int): Option[(Char, Int)] = Some((k, v * 2))
        
        val uMap_map = uMap.map { case (k, v) => h(k, v).getOrElse((k, v)) }
        println(s"Map values doubled using map with function h = $uMap_map")
        
        val uMap_flatMap = uMap.flatMap { case (k, v) => h(k, v) }
        println(s"Map values doubled using flatMap = $uMap_flatMap")
    }
}



/**
 * @author kal
 */
object MissingNumbers {
      def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a = new Array[Int](n)
        for ( i <- 0 to n-1)
          a(i) = sc.nextInt
          
       var m = sc.nextInt()
       var b = new Array[Int](m)
       for ( j <- 0 to m-1)
         b(j) = sc.nextInt
         
         println(b.size)
       // Put b's in a map ..and then put a's in a map
       val bMap = scala.collection.mutable.Map[Int, Int]()
       val aMap = scala.collection.mutable.Map[Int, Int]()
       
       for ( j <- 0 to m-1) 
         bMap(b(j)) = bMap.get(b(j)).map(_ + 1).getOrElse(1)
       for (i <- 0 to n-1)
         aMap(a(i)) = aMap.get(a(i)).map(_ + 1).getOrElse(1)
       
       val aList = scala.collection.mutable.MutableList[Int]()
       bMap.map { case (k, v) =>
         aMap.get(k).map { t =>
           if (t < v)
             aList += k
         } getOrElse(aList +=k)
       }
       
       aList.sorted.map(t => print(s"$t "))
       println()
      }
}
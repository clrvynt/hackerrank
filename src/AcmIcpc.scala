import scala.collection.mutable.BitSet

object AcmIcpc {
      def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var m = sc.nextInt();
        var topic = new Array[String](n);
        for(topic_i <- 0 to n-1) {
           topic(topic_i) = sc.next();
        }
        
        val bitSets = topic.map { t =>
          val setBits = for {
            (x, i) <- t.zipWithIndex
            if ( x == '1')
          }
          yield{
            i
          }
          BitSet() ++ setBits
        }
        var max = 0
        var maxMap = scala.collection.mutable.Map[Int, Int]()
        for ( i <- 0 to bitSets.length - 2) {
          for ( j <- i + 1 to bitSets.length -1 ) {
            println(s"i $i and j $j")
            val b = bitSets(i) | bitSets(j)
            max = math.max(max, b.size)
            maxMap.put(b.size, maxMap.get(b.size).getOrElse(0) + 1)
          }
        }
        println(max)
        println(maxMap.get(max).getOrElse(0))
    }
}
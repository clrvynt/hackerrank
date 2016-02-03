

/**
 * @author kal
 */
object ManasaStones {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
            var n = sc.nextInt();
            var a = sc.nextInt();
            var b = sc.nextInt();
            a0+=1;
            
            val numberSet = scala.collection.mutable.SortedSet[Int]()
            for ( i <- 0 to n-1) {
              numberSet.add(i * a + ((n-1) - i) * b )
            }
            
            for ( i <- numberSet)
              print(s"$i ")
            println()
        }

    }
}
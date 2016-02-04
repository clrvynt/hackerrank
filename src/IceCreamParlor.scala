

/**
 * @author kal
 */
object IceCreamParlor {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
            var m = sc.nextInt();
            var n = sc.nextInt();
            var arr = new Array[Int](n)
            for ( i <- 0 to n-1)
              arr(i) = sc.nextInt()
              
            a0+=1;
            val numMap = scala.collection.mutable.Map[Int, Int]()
            for ( i <- 0 to n-1) {
              numMap.get(m - arr(i)).map { t =>
                if ( i > t) {
                  println(s"${t + 1} ${i + 1}")
                }
                else if (i < t) {
                  println(s"${i + 1} ${t + 1}")
                }
                else {
                  // if the two indices are equal, then we should ignore it
                }
              }
              numMap(arr(i)) = i
            }
        }
    }
}


/**
 * @author kal
 */
object SortingIntro {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var v = sc.nextInt();
        var n = sc.nextInt();
        var arr = new Array[Int](n);
        for(topic_i <- 0 to n-1) {
           arr(topic_i) = sc.nextInt();
        }
        
        for ( i <- 0 to n - 1) {
          if ( arr(i) == v) {
            println(i)
          }
        }
  }
}
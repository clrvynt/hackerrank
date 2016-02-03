

/**
 * @author kal
 */
object KadanesAlgorithm {
      def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
            var n = sc.nextInt();
            var arr = new Array[Long](n);
            for(i <- 0 to n-1) {
               arr(i) = sc.nextLong()
            }
            a0+=1
            var maxCurr = 0L
            var max = 0L
            var leftCurr = 0
            var rightCurr = 0
            var leftMax = 0
            var rightMax = 0
            for ( i <- 0 to n -1 ) {
              //maxCurr = math.max(0, maxCurr + arr(i))
              if ( maxCurr + arr(i) < 0) {
                leftCurr = i 
                rightCurr = i
                maxCurr = 0
              }
              else {
                if ( maxCurr == 0)
                  leftCurr = i
                rightCurr = i
                maxCurr = maxCurr + arr(i)
              }
              
              if ( max < maxCurr ) {
                max = maxCurr
                leftMax = leftCurr
                rightMax = rightCurr
              }
              
              println(s"maxCurr is $maxCurr with indices ($leftCurr, $rightCurr), max is $max with indices ($leftMax, $rightMax)")
            }
           println(max)
        }
      }
}
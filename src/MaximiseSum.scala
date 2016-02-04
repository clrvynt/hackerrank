/**
 * @author kal
 */
object MaximiseSum {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
            var n = sc.nextInt();
            var m = sc.nextLong();
            var arr = new Array[Long](n);
            for(i <- 0 to n-1) {
               arr(i) = sc.nextLong() % m
            }
            a0+=1
            
            
            /* BRUTE FORCE */
            def bruteForce() = {
              var maxSum = 0L
              for ( i <- 0 to n-1) {
                var cumulativeSum = 0L
                for ( j <- i to n-1 ) {
                  cumulativeSum += arr(j)
                  if ( cumulativeSum % m > maxSum)
                    maxSum = cumulativeSum % m
                }
              }
             println(maxSum)
            }
            
            /* KADANE's ALGORITHM */
            def kadanes() = {
              var maxCurr = 0L
              var max = 0L
              var prev = 0L
              for (i <- 0 to n-1) {
                if ( i > 0)
                  prev = arr(i-1)
                  
                maxCurr = math.max(maxCurr, math.max((maxCurr + arr(i)) % m, (maxCurr + prev) % m))
                max = math.max(max, maxCurr)
              }
              
              println(max)
            }
            
            kadanes()
            bruteForce()
              
        }
    }
}
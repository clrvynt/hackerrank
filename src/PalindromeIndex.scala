

/**
 * @author kal
 */
object PalindromeIndex {
      def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
          val s = sc.next()
          a0+=1
          
          var left = 0
          var right = s.length - 1
          var i = 0
          var mismatchedCandidates = (-1, -1)
          var mismatchedOnce = false
          var mismatchedTwice = false
          while ( i <= s.length / 2 && !mismatchedTwice) {
            if ( s(left + i) != s(right -i)) {
              if ( !mismatchedOnce) {
                mismatchedCandidates = (left + i, right -i)
                // Increment left alone
                left += 1
                mismatchedOnce = true
              }
              else {
                mismatchedTwice = true
              }
            }
            else 
              i += 1
          }
          
          if ( mismatchedTwice )
            println(mismatchedCandidates._2)
          else if (mismatchedOnce) 
            println(mismatchedCandidates._1)
          else
            println(-1)
          

        }
      }
}
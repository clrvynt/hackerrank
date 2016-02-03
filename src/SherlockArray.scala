

/**
 * @author kal
 */
object SherlockArray {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        
        var a0 = 0;
        while(a0 < t) {
          a0 +=1
          var n = sc.nextInt();
          var arr = new Array[Int](n);
          var sum = 0
          for(topic_i <- 0 to n-1) {
           arr(topic_i) = sc.nextInt();
           sum += arr(topic_i)
          }
          
          if ( n == 1) println("YES") else {
          var leftSum = arr(0)
          var rightSum = sum - leftSum - arr(1)
          var i = 1
          while ( i < n - 1 && leftSum != rightSum) {
            i +=1
            leftSum += arr(i-1)
            rightSum -= arr(i)
          }
          if (leftSum == rightSum)
            println("YES")
          else
            println("NO")
        }
        }
  }
}
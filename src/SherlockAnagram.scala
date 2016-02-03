

/**
 * @author kal
 */
object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
          val s = sc.next()
          a0+=1
              
          var j = 1
          var count = 0
          while ( j < s.length) {
              for ( i <- 0 to s.length - 1 - j) {
                  val sub1 = s.substring(i, i+j)
                  for ( k <- i + 1 to s.length -j) {
                      val sub2 = s.substring(k, k+j)
                      if ( sub1.sorted == sub2.sorted) {
                          count += 1
                      }
                  }
              }
              j += 1
          }
          println(count)
        }
    }
}
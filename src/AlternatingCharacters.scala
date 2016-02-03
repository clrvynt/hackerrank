

/**
 * @author kal
 */
object AlternatingCharacters {
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
          val s = sc.next()
          a0+=1
            var deleteChars = 0
            var i = 0
            while ( i < s.length -1 ) {
              val c = s(i)
              val n = s(i+1)
              if ( c == n ) 
                  deleteChars += 1
              i += 1
          }
          println(deleteChars)
        }
    }
}
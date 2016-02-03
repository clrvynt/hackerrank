

/**
 * @author kal
 */
object FunnyString {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
          val s = sc.next()
          a0+=1
          val r = s.reverse
          var b = true
          for (i <- 1 to s.length - 1) {
            val s_i = s.charAt(i)
            val s_ii = s.charAt(i-1)
            
            val sDiff = math.abs(s_i - s_ii)
            val r_i = r.charAt(i)
            val r_ii = r.charAt(i-1)
            
            val rDiff = math.abs(r_i - r_ii)
            if ( sDiff != rDiff) 
              b = false
          }
          if (b) println("Funny") else println("Not Funny")
          
        }
  }
}


/**
 * @author kal
 */
object SherlockBeast {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
            var n = sc.nextInt();
            a0+=1;
            
            var numThrees = 0;
            var numFives = n;
            
            val p : Seq[Int] = for {
                i <- (0 to n)
                if ( i % 5 == 0 && (n-i) % 3 == 0)
            } yield {
                    (n - i)
            }
            
            if (p.size == 0 )
                println(-1)
            else {
                // Find the max
                val t = p.foldLeft(0)((b , a) => if ( b > a) b else a)
                println("5" * t + "3" * (n-t))
            }
                
            
        }
    }
}

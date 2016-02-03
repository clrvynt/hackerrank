

/**
 * @author kal
 */
object SherlockSquares {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
            var a = sc.nextInt();
            var b = sc.nextInt();
            a0 += 1
            val sqrta = math.sqrt(a);
            val sqrtb = math.sqrt(b);
            
            val tot = (sqrta.toInt to sqrtb.toInt).foldLeft(0) { (nums , num ) =>
                val sq = num * num ;
                if ( a <= sq && sq <= b )
                    nums + 1
                else
                    nums
            }
            println(tot)
        }
    }
}
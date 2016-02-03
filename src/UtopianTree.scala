

/**
 * @author kal
 */
object UtopianTree {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
            var n = sc.nextInt();
            a0+=1;
            
            val tot = (1 to n).foldLeft(1) { (b, i) =>
            val isSpring = ((i % 2) == 1)
            if ( isSpring) (b*2) else (b + 1)
            }
            println(tot)
        }
        
        
    }
}
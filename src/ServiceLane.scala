

/**
 * @author kal
 */
object ServiceLane {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var t = sc.nextInt();
        var width = new Array[Int](n);
        for(width_i <- 0 to n-1) {
           width(width_i) = sc.nextInt();
        }
        var a0 = 0;
        while(a0 < t){
            var i = sc.nextInt();
            var j = sc.nextInt();
            a0+=1;

            println(width.slice(i, j+1).foldLeft(3) { (b , el) =>
                if (el < b) el else b
            })
        }
    }
}
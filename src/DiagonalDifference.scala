object DiagonalDifference {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a = Array.ofDim[Int](n,n);
        for(a_i <- 0 to n-1) {
           for(a_j <- 0 to n-1){
              a(a_i)(a_j) = sc.nextInt();
           }
        }
        
        val mainSum = (0 to n-1).foldLeft(0)((b1, a1) => b1 + a(a1)(a1))
        val oppSum = (0 to n-1).foldLeft(0)((b1, a1) => b1 + a(a1)(n - 1 - a1))
        
        println(math.abs(mainSum - oppSum))
    }
}

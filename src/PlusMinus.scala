object PlusMinus {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var arr = new Array[Int](n);
        for(arr_i <- 0 to n-1) {
           arr(arr_i) = sc.nextInt();
        }
        
        val p = arr.filter(_ > 0).size
        val neg = arr.filter(_ < 0).size
        val z = arr.filter(_ == 0).size
            
        println(p.toFloat/n)
        println(neg.toFloat/n)
        println(z.toFloat/n)
    }
}

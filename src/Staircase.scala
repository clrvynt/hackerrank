object Staircase {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        
        val s = " " * (n-1);
    val s1 = "#" * n;
    (0 to n-1).map { i =>
        println((s + s1).substring(i, n + i))
    }
    }
    
    
}

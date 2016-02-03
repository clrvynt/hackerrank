
object TaumBDay {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
            var b = sc.nextInt();
            var w = sc.nextInt();
            var x = sc.nextInt();
            var y = sc.nextInt();
            var z = sc.nextInt();
            a0+=1;
            
            if ( z > math.abs(x - y))
              println(b.toLong * x + w.toLong * y)
            else {
              if (x > y) {
                println((b + w) * y.toLong + b * z.toLong)
              }
              else {
                println((b + w) * x.toLong + w * z.toLong)
              }
            }
        }
    }
}
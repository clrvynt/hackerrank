

/**
 * @author kal
 */
object FindDigits {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
            var n = sc.nextInt();
            a0+=1;

            val s = n.toString.foldLeft(0) { (count, ch) =>
                ch.toString.toInt match {
                case 0 =>
                    count
                case default =>
                    if (n % default  == 0  )
                        count + 1
                    else
                        count
                }
            }
            println(s)
        }
    }
}
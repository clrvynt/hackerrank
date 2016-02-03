

/**
 * @author kal
 */
object CaesarCipher {
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var s = sc.next();
        var k = sc.nextInt();

        val alpha = "abcdefghijklmnopqrstuvwxyz"
        val capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val out = s.map { ch =>
            val lowerIdx = alpha.indexOfSlice(ch.toString)
            if ( lowerIdx >= 0) {
                val rotIdx = (lowerIdx + k) % 26
                alpha.substring(rotIdx, rotIdx +1)
            }
            else {
                val upperIdx = capital.indexOfSlice(ch.toString)
                if ( upperIdx >= 0) {
                    val rotIdx = (upperIdx + k) % 26
                    capital.substring(rotIdx, rotIdx +1)
                }
                else {
                    ch.toString
                }
            }
        }
        println(out.mkString(""))
    }
}


/**
 * @author kal
 */
object Pangram {
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var s =sc.nextLine()
        
        val ch = "abcdefghijklmnopqrstuvwxyz"
        val b = ch.foldLeft(true)({ (bo, a) =>
          bo && (s.toLowerCase.indexOf(a.toString) >= 0)
        })
        
        if ( b ) println("pangram") else println("not pangram")
    }  
}


/**
 * @author kal
 */
object LibraryFine {
  def main(args: Array[String]) {
      val sc = new java.util.Scanner (System.in);
        var d1 = sc.nextInt();
        var m1 = sc.nextInt();
        var y1 = sc.nextInt();
        var d2 = sc.nextInt();
        var m2 = sc.nextInt();
        var y2 = sc.nextInt();
        
        if ( y1 > y2 ) {
          println(10000)
        }
        else if ( y1 == y2) {
          if ( m1 > m2) {
            println(500 * (m1 -m2))
          }
          else if ( m2 == m1) {
            if ( d1 > d2)
              println(15 * (d1 - d2))
            else
              println(0)
          }
          else
            println(0)
        }
        else 
          println(0)
  }
}
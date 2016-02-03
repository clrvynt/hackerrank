object Encryption {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var s = sc.next();
        
        var row = math.sqrt(s.length).toInt
        var column = if ( row * row == s.length) row else row + 1 
        
        while ( s.length > row * column) {
          if ( row == column) column+=1 else row+=1
        }
        
        println(s"ROW $row COLUMN $column")
        var arr = Array.ofDim[Char](row, column)
        var inc = 0
        for ( i <- 0 to row -1) {
          for ( j <- 0 to column - 1) {
            arr(i)(j) = if ( inc > s.length -1) ' ' else s(inc)
            inc += 1
          }
        }
        
        for (j <- 0 to column -1 ) {
          val charBuf = scala.collection.mutable.ListBuffer[Char]()
          for ( i <- 0 to row -1 ) {
            charBuf += arr(i)(j)
          }
          print(charBuf.mkString("").trim + " ")
        }
          
        
    }
}

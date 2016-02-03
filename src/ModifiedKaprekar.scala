

/**
 * @author kal
 */
object ModifiedKaprekar {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var p = sc.nextInt();
        var q = sc.nextInt();
        
        val numberSet = scala.collection.mutable.SortedSet[Int]()
        for ( i <- p to q) {
          if ( isKaprekar(i))
            numberSet.add(i)
        }
        if (numberSet.isEmpty) {
          println("INVALID RANGE")
        }
        else {
          for (i <- numberSet)
            print(s"$i ")
          println()
        }
    }
    
    def isKaprekar(i: Int): Boolean = {
      if ( i == 1)
        return true
        
      val sq = (i.toLong * i.toLong).toString
      val len = i.toString.length
      val right = sq.substring(sq.length - len)
      var left = sq.substring(0, sq.length - len)
      if ( left.length == len || left.length == (len -1)) {
        if ( left == "" ) left = "0"
        if ( left.toLong + right.toLong == i && ( right.toLong > 0)) return true
      }
      false
    }
  
}
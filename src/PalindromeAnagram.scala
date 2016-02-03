

/**
 * @author kal
 */
object PalindromeAnagram {
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var s =sc.nextLine()
        
        val countMap = s.groupBy(i => i).mapValues(_.size)
        if ( s.length() % 2 == 0) {
          // Length is even. so every element in count map has to be even.
          val b = countMap.foldLeft(true)((bo, t) => {
            bo && (t._2 %2 == 0)
          })
          if (b) println("YES") else println("NO")
        } else {
          // Length is odd .. so exactly one element has to be odd.
          val b = countMap.foldLeft(0)((bo, t) =>{
            bo + (if (t._2 % 2  == 1) 1 else 0)
          })
          if ( b == 1) println("YES") else println("NO")
        }
          
        
    }   
}
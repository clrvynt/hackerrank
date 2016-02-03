
object TimeInWords {
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var h = sc.nextInt();
        var m = sc.nextInt();
        
        val words = Map(1 -> "one", 2 -> "two", 3 -> "three", 4 -> "four", 5 -> "five" , 
            6 -> "six", 7 -> "seven", 8 -> "eight", 9 -> "nine", 10 -> "ten", 11 -> "eleven", 
            12 -> "twelve", 13 -> "thirteen", 14 -> "fourteen", 16 -> "sixteen", 
            17 -> "seventeen", 18 -> "eighteen", 19 -> "nineteen", 20 -> "twenty")
        
        def formMinuteWord(m: Int, h: String, nextHour: String) = {
          val lt = if (m < 30) s"past $h" else s"till $nextHour"
          val mm = if ( m > 30 ) 60-m else m
          mm match {
            case 0 =>
              s"$h o' clock" 
            case 30 =>
              s"half past $h"
            case 1 =>
              s"one minute $lt"
            case 15 =>
              s"quarter $lt"
            case i if ( i >1 && i <=20 ) =>
              s"${words(i)} minutes $lt"
            case default =>
              s"twenty ${words(default -20)} minutes $lt"
          }
        }
        
        println(formMinuteWord(m, words(h), words(h+1)))
    }
}


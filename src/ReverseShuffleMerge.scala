

/**
 * @author kal
 */
object ReverseShuffleMerge {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var s =sc.nextLine()
        
        val countMap = s.groupBy(i => i).mapValues(_.size)
        val m = countMap.map {
          case (k, v) =>
            k.toString * (v/2)
        }
        println(m.toList.sorted.mkString(""))
    }
}
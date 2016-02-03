

/**
 * @author kal
 */
object CutTheSticks {
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var arr = new Array[Int](n);
        for(arr_i <- 0 to n-1) {
           arr(arr_i) = sc.nextInt();
        }
        cut(arr)
    }

    def cut(arr: Array[Int]):Unit = {
        if (arr.size > 0) {
            println(arr.size)
            val m = arr.foldLeft(Integer.MAX_VALUE)((b, a) => if (b < a) b else a)
            val newArr = arr.map({ i =>
                i - m
            }).filter({i =>
                i > 0
            })
            cut(newArr)
        }
    }
}
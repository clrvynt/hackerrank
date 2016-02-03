

/**
 * @author kal
 */
object FibonacciModified {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    val a = sc.nextInt();
    val b = sc.nextInt();
    val n = sc.nextInt();
    
    var arr = new Array[Int](n)
    arr(0) = a
    arr(1) = b
    for (i <- 2 to n-1) 
      arr(i) = arr(i-1) * arr(i-1) + arr(i-2)
      
    println(arr(n-1))
    
  }
}
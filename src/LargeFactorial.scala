

import scala.annotation.tailrec

object LargeFactorial {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        
        println(fact(BigInt(1), BigInt(n)))
    }
  
  @tailrec def fact(acc: BigInt, num: BigInt) : BigInt = {
    if ( num == 1) acc else fact(num * acc, num -1)
  }
}
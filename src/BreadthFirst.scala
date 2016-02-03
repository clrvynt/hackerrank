

/**
 * @author kal
 */
object BreadthFirst {
  def main(args: Array[String]) {
            val sc = new java.util.Scanner (System.in);
        
        val t = sc.nextInt();
        var a0 = 0;
        while (a0 < t) {
          val n = sc.nextInt();
          val m = sc.nextInt();
          a0+=1
          var arr = new Array[(Int, Int)](m)
          for ( m_i <- 0 to m-1) 
            arr(m_i) = (sc.nextInt, sc.nextInt)
           
          val s = sc.nextInt()
          // Create data structure to hold the graph 
          val graph = scala.collection.mutable.Map[Int, List[Int]]()
          for ( t <- arr) {
            graph.get(t._1).map({ l =>
              graph.put(t._1, t._2 :: l)
            }).getOrElse(graph.put(t._1, List(t._2)))
          }
          
          // Breadth first search
          def bfs(graph: scala.collection.mutable.Map[Int, List[Int]], root: Int) = {
            val m = scala.collection.mutable.Map[Int, Int]()
            
            for ( i <- 1 to n) {
              if ( i == root)
                m.put(i, 0)
              else
                m.put(i, -1)
            }
            
            var queue = scala.collection.mutable.Queue[Int]()
            queue.enqueue(root)
            
            while (!queue.isEmpty) {
              var current = queue.dequeue()
              val currentCount = m.get(current).head
              graph.get(current).headOption.map { edges =>
              for ( edge <- edges ) {
                val distance = m.get(edge).head
                if ( distance == -1) {
                  m.put(edge, currentCount + 6)
                  queue.enqueue(edge)
                }
               }
              }
            }
            m
          }
          
          val b = bfs(graph, s)
          for (i <- 1 to n) {
            if ( i != s)
              print(s"${b(i)} ")
          }
          println()

        }
  }
}
import com.atomicscala.AtomicTest._

/**
 * // Reduce.scala
import com.atomicscala.AtomicTest._
val v = Vector(1, 10, 100, 1000)
v.reduce((sum, n) => sum + n) is 1111
using for loops.
 */
object week7_3 extends App {
  
  val v = Vector(1, 10, 100, 1000)
  var sum=0
  
  v.reduce((sum, n) => sum + n) is 1111
  
  for (n <- v) {(sum+=n)
    
  }
   sum is 1111
}
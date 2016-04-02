
import com.atomicscala.AtomicTest._

/**
 * 2. Rewrite the following code:
import atomic.AtomicTest._
val v = Vector(1, 2, 3, 4)
v.map(n => n + 1) is Vector(2, 3, 4, 5)
using a for loop instead of map, and observe the additional complexity this introduces.
 */

object week7_2 extends App {
  
  val v = Vector(1, 2, 3, 4)
  var Add_v= Vector()
  
  //v.map(n => n + 1) is Vector(2, 3, 4, 5)
  
  for (n <- v ) yield n+1 is Vector(2, 3, 4, 5)///?? ask Robi if its ok doest not return the whole vector at once
  
}
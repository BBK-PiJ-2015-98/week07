
import com.atomicscala.AtomicTest._

/**
 * map & reduce
1. (a) Modify the following code:
import atomic.AtomicTest._
val v = Vector(1, 2, 3, 4)
v.map(n => n + 1) is Vector(2, 3, 4, 5)
so the anonymous function multiplies each value by 11 and adds 10.
Satisfy the following tests:
val v = Vector(1, 2, 3, 4)
v.map(/* Fill this in */) is Vector(21, 32, 43, 54)
(b) Can you replace map with foreach in the above solution? What happens? Test
the result.
(c) Rewrite the solution for the previous exercise part using for. Was this more
or less complex
 * 
 */

object week7_1 extends App{
  
  val v = Vector(1, 2, 3, 4)
  
  println (v)
  
  for (n <- v) yield (n * 11) + 10  is Vector(21, 32, 43, 54)// ????>>>>>>> creating error since its printing on New line
  
  //v.map(n => n + 1) is Vector(2, 3, 4, 5)
  
  v.map(n => (n * 11) +10)  is Vector(21, 32, 43, 54)
  
// (v) foreach (n => (n * 11) +10)  is Vector(21, 32, 43, 54)// foreach return unit not Vector need to creat a varible to store the new value
  
  
   
}

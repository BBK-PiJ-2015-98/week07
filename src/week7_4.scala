
import com.atomicscala.AtomicTest._
/**
 * Use reduce to implement a method sumIt that takes a variable argument list and
sums those arguments.
Satisfy the following tests:
sumIt(1, 2, 3) is 6
sumIt(45, 45, 45, 60) is 195
 * 
 */
object week7_4 extends App {
  
  def sumIt(x: Int*) ={
    
     x.reduce((sum, n) => sum + n)
    
  }
  
  sumIt(1, 2, 3) is 6
  sumIt(45, 45, 45, 60) is 195
  
}
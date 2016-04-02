package week7

object Q_1 {

  val v = Vector(1, 2, 3, 4)                      //> v  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4)
  
  var V=Vector()                                  //> V  : scala.collection.immutable.Vector[Nothing] = Vector()
  
  var sum= 0                                      //> sum  : Int = 0
  
  for (n <- v) yield ((n * 11) + 10)              //> res0: scala.collection.immutable.Vector[Int] = Vector(21, 32, 43, 54)
  
  v.map(n => (n * 11) +10)                        //> res1: scala.collection.immutable.Vector[Int] = Vector(21, 32, 43, 54)
  
  for (n <- v)((n * 11) + 10)
  
 println (v)                                      //> Vector(1, 2, 3, 4)
 
  for (n <- v) sum+=n
  println (sum)                                   //> 10
  
 
}
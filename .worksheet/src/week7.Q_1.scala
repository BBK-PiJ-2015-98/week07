package week7

object Q_1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 

  val v = Vector(1, 2, 3, 4);System.out.println("""v  : scala.collection.immutable.Vector[Int] = """ + $show(v ));$skip(20); 
  
  var V=Vector();System.out.println("""V  : scala.collection.immutable.Vector[Nothing] = """ + $show(V ));$skip(16); 
  
  var sum= 0;System.out.println("""sum  : Int = """ + $show(sum ));$skip(40); val res$0 = 
  
  for (n <- v) yield ((n * 11) + 10);System.out.println("""res0: scala.collection.immutable.Vector[Int] = """ + $show(res$0));$skip(30); val res$1 = 
  
  v.map(n => (n * 11) +10);System.out.println("""res1: scala.collection.immutable.Vector[Int] = """ + $show(res$1));$skip(33); 
  
  for (n <- v)((n * 11) + 10);$skip(16); 
  
 println (v);$skip(24); 
 
  for (n <- v) sum+=n;$skip(16); 
  println (sum)}
  
 
}

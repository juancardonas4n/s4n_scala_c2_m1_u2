// Imports 
import scala.math._















// Ejercicio 1

def factorial(n:Int):Int = n match {
  case 0 => 1
  case n => n * factorial(n - 1)
}











// Ejercicio 2

def incr(n:Int) = n + 1
def decr(n:Int) = n - 1

def sumRec(a:Int, b:Int):Int = (a,b) match {
  case (a,0) => a
  case (0,b) => b
  case (a,b) => sumRec(incr(a),decr(b))
}










// Ejercicio 3
def int2String(i:Int):List[Char] = {
  def iInt2String(i:Int):List[Char] = {
    if (i != 0) {
      val d = i % 10
      val c = (d + '0').toChar
      int2String(i / 10) :+ c
    }
    else List()
  }
  if (i == 0) List('0')
  else if (i < 0) '-' +: iInt2String(abs(i))
  else iInt2String(i)
}




// Ejercicio 4
def sumList(lst:List[Int]):Int = {
  if (lst.isEmpty) 0
  else lst.head + sumList(lst.tail)
}



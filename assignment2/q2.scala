import scala.util.control.Breaks._  
import scala.io.StdIn._


object PrimeNo extends App{

  def gcd(x:Int,y:Int):Int=y match{
    case 0=>x
    case y if(y>x) =>gcd(y,x)
    case _ =>gcd(y,x%y)
  }

  def prime(p:Int,n:Int=2):Boolean= n match{
    case x if p==x => true

    case x if gcd(p,x)>1 => false

    case x  =>prime(p,x+1)

   }

   def primeSeq(x:Int,y:Int){
    if (x==y){
        break;
    }
    if(prime(y,2)){
        println(y);
    }
    primeSeq(x,y+1);
   }


  print("Enter a Number: ");
  var z=readInt();

  primeSeq(z,2);

}

import scala.io.StdIn._
import scala.util.control.Breaks.break

object fibonacciSequence  extends App{

  def fibonacci(n:Int):Int={
     
     if(n<=1)
        n;
     else
         fibonacci(n-1)+ fibonacci(n-2) ;
     
  }
  
  def printFibonacci(n:Int,i:Int){
    
      if(n==i)
          break;
       else
         println(fibonacci(i));
      printFibonacci(n,i+1);
      
}
    print("Enter a Number: ");
    var z=readInt();

    printFibonacci(z,0);

}

import scala.io.StdIn._
object evenNumbers extends App{
  def evenSum(x:Int):Int={
        if(x==0){
            0
        }
        else{
            if(x%2==0)
            {
                x+evenSum(x-2)
            }
            else{
               evenSum(x-1)
             }
        }  
    }

  print("Enter a Number: ");
  var z=readInt();
  println(evenSum(z));

}

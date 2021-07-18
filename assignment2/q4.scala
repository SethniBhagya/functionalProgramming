import scala.io.StdIn._
object Numbers extends App{


    def evenOdd(x:Int){
        if(x%2==0)
        {
            println("even");
        }
        else{
             println("odd");
        }
    }

  print("Enter a Number: ");
  var z=readInt();
  evenOdd(z);


}

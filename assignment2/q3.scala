import scala.io.StdIn._


object addNumbers extends App{


    def add(x:Int):Int={
        if(x==0)
        {
            0;
        }
        else{
            x+add(x-1);
        }
    }

  print("Enter a Number: ");
  var z=readInt();

  println(add(z));

}

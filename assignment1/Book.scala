
object Book extends App{
    var price:Double=24.50;
    def pricewithdiscount(x:Int):Double=x*(price*140/100);
   // println(pricewithdiscount(60));
    
    def cost(x:Int):Double=((x-50)*0.75)+(50*3)+(pricewithdiscount(x));
     println(cost(60));
}

import scala.io.StdIn._
object CeasarCipher extends App{

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	val key = (readLine("Key: ").toInt + alphabet.size) % alphabet.size
	val input = readLine("Secret Message: ")

	val output = input.map( (c: Char) => { 


		val x = alphabet.indexOf(c.toUpper)

		if (x == -1){
			c
		}
		else{
			alphabet((x + key) % alphabet.size)
			} 
	});

	println(output);
}

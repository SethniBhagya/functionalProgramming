object MyApp extends App{
	var bank:List[Account]=List()
	val acc= new Account("994637287V",2000,30000)
	println (acc)
}





class Account(id:String,n: Int, b: Double) {
	val nic:String=id
	val acnumber: Int = n
	var balance: Double = b

	override def toString ="["+nic+":"+acnumber +":"+ balance+"]"
}

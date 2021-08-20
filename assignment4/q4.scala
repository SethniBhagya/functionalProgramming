object MyApp extends App{
	
	val acc1= new Account("994637487V",200,305600)
	val acc2= new Account("99434337287V",2000,304300)
	val acc3= new Account("994000287V",2600,-30000)
	val acc4= new Account("99432337287V",2070,-780000)
	var bank:List[Account]=List(acc1,acc2,acc3,acc4)
	

	val find=(n:String,b:List[Account])=>b.filter(x=>x.nic.equals(n))


	val overdraft=(b:List[Account])=> b.filter(x=>x.balance < 0)

	val balance=(b:List[Account])=> b.map( x => (x,x.balance) ).reduce( (a , c) => ( c._1 , a._2 + c._2) )



	//If balance is positive deposit interest is .05
	//If balance is negative overdraft interest is .1
	val interest=(b:List[Account])=>b.map( x => {
        x.balance match {
            case a if a >= 0 => x deposit x.balance * 0.05
            case _ => x withdraw Math.abs(x.balance) * 0.01

        }
        x
    })

     println("bank " + bank )
    println()
    println("find " + find("994637487V", bank) )
    println()
    println("overdraft " + overdraft( bank ) )
    println()
    println("balance " + balance( bank )._2 )
    println()

    bank = interest( bank )

    println("bank " + bank )
    println()
    println("balance " + balance( bank )._2 )
    println()

class Account(id:String,n: Int, b: Double) {
	val nic:String=id
	val acnumber:Int = n
	var balance: Double = b

	def withdraw( amount : Double ) = this.balance -= amount

    def deposit ( amount : Double ) = this.balance += amount

    def transfer( amount : Double , that : Account ): Unit = {
        this.balance =  this.balance - amount
        that.balance = that.balance + amount
    }

	override def toString ="["+nic+":"+acnumber +":"+ balance+"]"
}
	
}

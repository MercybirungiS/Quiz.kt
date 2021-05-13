fun main() {

    var cars = mutableListOf<Car>(Car("Rav4","four","blue"),
        Car("Rav4","ONE","red"),
        Car("Rav4","two","orange"),
        Car("Rav4","three","blue"))
    findColor(cars)


    println(length("Birungi"))

    var account = CurrentAccount(65239559,"Water",87000.00)
    account.deposit(460000000.00)
    account.withdraw(2000000.00)
    account.details()

    var account2 = SavingsAccount(509738999559,"Water",94000.00,10)
    account2.deposit(85090000.0)
    account2.withdraw(4500000.0)
    account2.details()
    account2.withdrawals()

}

data class Car(var make:String, var model:String,var color:String)
fun findColor(cars:List<Car>){
    var redCars = mutableListOf<Car>()
    var blueCars = mutableListOf<Car>()
    var others = mutableListOf<Car>()


    var color = cars.forEach { car ->  car.color}
    println(color)
    when (color) {
        "red"  -> redCars.plus(cars)
        " blue" -> blueCars.plus(cars)
        else -> others.plus(cars)
    }
}

fun length(word:String):Int{
    return word.length
}
class CurrentAccount(var accNumber: Long, var accName:String, var balance:Double){
    fun deposit(amount: Double){

    }
    fun withdraw(amount: Double){
        balance-=amount
    }
    fun details(){
        println("Account number ${accNumber} with balance ${balance} id operated by ${accName}")
    }

}
class SavingsAccount(var accNumber: Long, var accName:String, var balance:Double, var withdrawals:Int){
    fun deposit(amount: Double){
        balance+=amount
    }
    fun withdraw(amount: Double){
        balance-=amount
    }
    fun details(){
        println("Account number ${accNumber} with balance ${balance} id operated by ${accName}")
    }
    fun withdrawals() {
        if (withdrawals<4 ){
            withdrawals++
        }
    }
}

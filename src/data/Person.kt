package data

class Person {
    var firstName:String =""
    var middleName:String? = null
    var lastname:String =""

    fun sayHello(name:String){
        println("hallo $name, my name is $firstName")

    }

    fun run(){
        println("i m run")
    }

    fun getFullName(){
         println("Hallo my full name is $firstName $middleName , $lastname")
    }
}

fun main(){
    val riyan = Person()

    riyan.firstName = "Supriyanto"
    riyan.lastname ="riaynto"

    println(riyan.firstName)
    println(riyan.lastname)
}
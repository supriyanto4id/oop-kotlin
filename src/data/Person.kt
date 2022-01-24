package data

class Person {
    var firstName:String =""
    var middleName:String? = null
    var lastname:String =""

}

fun main(){
    val riyan = Person()

    riyan.firstName = "Supriyanto"
    riyan.lastname ="riaynto"

    println(riyan.firstName)
    println(riyan.lastname)
}
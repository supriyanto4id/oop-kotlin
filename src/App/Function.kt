package App

import data.Person

fun main(){
    val supri = Person()

    supri.firstName ="Supri"
    supri.lastname ="Yanto"
    supri.middleName= "syto4id"

    supri.sayHello("riyan")
    supri.run()
    supri.getFullName()
}
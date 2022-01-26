package data

open class Employee (val name:String){
    fun sayHello(name: String){
        println("Hello $name, My Name is ${this.name}" )
    }

    class Manager (Name:String) : Employee(Name)
    class VicePresident(name: String):Employee(name)
}
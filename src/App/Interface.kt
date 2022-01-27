package App

import data.Interaction

fun main(){
    val human =Interaction.Human("Supri")
    human.sayHello("budi")

    human.go()
    human.move()
}
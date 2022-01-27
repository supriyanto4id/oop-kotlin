package App

import data.Game

fun main(){
    val game = Game("Game Kotlin", 10000)

    val(name,price)= game

    println(name)
    println(price)
}
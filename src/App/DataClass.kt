package App

import data.Product

fun main(){
val product = Product("Indomie", 3000,"Food noodle")

    val product2 = product.copy("Sakura")


    println(product)
    println(product2)
}
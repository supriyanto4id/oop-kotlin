package App

import data.Television

fun main(){
    val tv = Television()

    tv.initTelivision()

    tv.brand ="Xiaomi"
    println(tv.brand)
}
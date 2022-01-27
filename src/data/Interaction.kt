package data

interface Interaction {
    val name :String
    fun sayHello(name:String){
        println("Hallo $name, my name is ${this.name}")
    }


    interface Go:Interaction{
        fun go(){
            println("Go")
        }
    }
    class Human( override val name: String): Go ,moveA,moveB{
        override fun move() {
            super<moveA>.move()
            super<moveB>.move()

            println("move human")
        }

    }

    interface moveA{
        fun move() = println("Move A")
    }

    interface moveB{
        fun move() = println("Move B")
    }
}
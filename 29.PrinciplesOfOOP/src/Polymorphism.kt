fun main(args: Array<String>) {
    val mom = MyMom()
    val daughter = MyDaughter()

    mom.say("Hi")
    daughter.say("Hi")
    mom.say("Hi")
    mom.say()
    mom.say(4)
    mom.say("hello", 2)
}

open class MyMom {
    open fun say(message: String) {
        println("Mom says $message")
    }
    // overloading
    fun say(times: Int) {
        for(i in 1..times) {
            println("Mom says hello $i")
        }
    }

    fun say() {
        println("Mom says hi how are you")
    }

    fun say(message: String, times: Int) {
        for(i in 1..times) {
            println("Mom says $message")
        }
    }
}

class MyDaughter: MyMom() {
    // override
    override fun say(message: String) {
        println("Daughter says $message")
    }
}

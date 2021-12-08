fun main(args: Array<String>) {
    val myOven: Oven = getOven()
    myOven.turnOn()
    myOven.cook(150)
    myOven.turnOff()
}

interface Oven {
    val temperature: Int

    fun turnOn()
    fun turnOff()
    fun cook(temp: Int) {
        println("Cooking at $temp degrees")
    }
}

class Bosch: Oven {
    override val temperature = 80

    override fun turnOn() {
        println("turning on")
    }

    override fun turnOff() {
        println("turning off")
    }
}

fun getOven(): Oven {
    return Bosch()
}

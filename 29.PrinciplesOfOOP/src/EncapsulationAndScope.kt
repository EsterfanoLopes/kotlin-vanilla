fun main(args: Array<String>) {

}

open class Airplane {
    //private val type = "Airbus"
    //protected val type = "Airbus"
    //internal val type = "Airbus"
    public val type = "Airbus"

    //private fun fly() {
    //protected fun fly() {
    //internal fun fly() {
    public fun fly() {
        println("flying")
    }
}

class MyAirplane: Airplane() {
    fun takeOff() {
        println(type)
        fly()
    }
}

class MyCar() {
    fun start() {
        val airplane = Airplane()
        println(airplane.type)
        airplane.fly()
    }
}
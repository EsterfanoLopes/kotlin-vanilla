fun main(args: Array<String>) {
    val container: Container = Bottle()
    container.pour()
    // cannot use fill since variable is from type container
    // container.fill
}

abstract class Container {
//    fun pour() {
//        println("pouring liquid")
//    }

    abstract fun pour()
}

class Bottle: Container() {
    override fun pour() {
        println("pouring bottle")
    }
}

class Jug: Container() {
    override fun pour() {
        println("pouring jug")
    }
}

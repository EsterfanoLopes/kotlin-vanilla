fun main(args: Array<String>) {
    // in
    val favouritePet = "cat"
    val avaiablePets = listOf<String>("dog", "cat", "horse")

    if(favouritePet in avaiablePets) {
        println("your favourite pet is available")
    }
    println("your favourite pet isn't available")

    // not in
    println("Enter your preferred coffee")
    val coffee = readLine()?:""
    val avaiableCoffee = listOf("cappuccino", "mocha")
    if(coffee !in avaiableCoffee) {
        println("We don't have your coffee")
    }
    println("$coffee is avaliable")

    // in range
    val number = 10
    if (number !in 0..9) {
        println("your number is not single digit positive")
    }
}

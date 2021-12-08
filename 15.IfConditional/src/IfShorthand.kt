fun main(args: Array<String>) {
    val number = 24

    // Common
    val isEven: Boolean?
    if (number % 2 == 0) {
        isEven = true
    } else {
        isEven = false
    }
    println(isEven)

    // Oneline
    val isEvenOneliner: Boolean?
    if (number % 2 == 0) isEvenOneliner = true else isEvenOneliner = false
    println(isEvenOneliner)

    // Shorthand
    val isEvenShorthand = if (number % 2 == 0) true else false
    println(isEvenShorthand)
}

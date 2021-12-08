fun main(args: Array<String>) {
    // order is not preserved. Can accept null
    val numbers = hashSetOf(3, 4, null, 5)
    val noNumbers = hashSetOf<Int>()
    println(numbers)
    println(noNumbers)
    // Add number
    numbers.add(44)
    println(numbers)
    // Add another set
    val newNumbers = setOf<Int>(56, 34)
    numbers.addAll(newNumbers)
    println(numbers)
    // remove element
    numbers.remove(56)
    println(numbers)
    // remove elements pointed from a set
    val toRemove = setOf(3, 5)
    numbers.removeAll(toRemove)
    println(numbers)
}

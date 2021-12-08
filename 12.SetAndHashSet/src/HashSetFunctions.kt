fun main(args: Array<String>) {
    val numbers = hashSetOf(3, 4, null, 83)
    val newNumbers = setOf(3, 83, 25)
    // keep elements in intersection
    numbers.retainAll(newNumbers)
    println(numbers)
    // clean hashset
    numbers.clear()
    println(numbers)
    println(numbers.isEmpty())
}

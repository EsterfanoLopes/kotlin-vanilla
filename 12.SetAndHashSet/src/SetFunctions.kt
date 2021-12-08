fun main(args: Array<String>) {
    val numbers = setOf(6, 37, null, 6, 42)
    // size of a set
    println(numbers.size)
    // check if element exists in the set
    println(numbers.contains(6))
    println(numbers.contains(5))
    // check if a set is contained in another set
    val newNumbers = setOf(6, 37, 42)
    println(numbers.containsAll(newNumbers))
    // check if is empty
    println(numbers.isEmpty())
    println(setOf<Int>().isEmpty())
}

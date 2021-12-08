fun main(args: Array<String>) {
    // does not persist repeated elements
    val numbers = setOf(6, 37, 6, 42)
    println(numbers)
    // allow empty since type is passed
    val numbers2 = setOf<Int>()
    println(numbers2)
    // allow null elements since null sign is informed
    val numbers3 = setOf<Int?>(6, 5, null, 8, null, 4)
    println(numbers3)
}

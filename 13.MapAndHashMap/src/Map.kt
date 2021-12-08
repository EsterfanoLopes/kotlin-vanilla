fun main(args: Array<String>) {
    // key:value data structure
    // keys are unique (set), values are not unique
    var count = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println(count)
    // empty map
    var count2 = mapOf<Int, String>()
    println(count2)
    // Get a value based on a key
    println(count.get(2))
    println(count[2])
    // get collection of keys
    println(count.keys)
    // get collection of values
    println(count.values)
}

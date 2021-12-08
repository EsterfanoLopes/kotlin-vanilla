fun main(args: Array<String>) {
    // key:value data structure that is mutable
    // keys are unique (set), values are not unique
    var count = hashMapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    // add element with specific key
    count[5] = "five"
    println(count)
    // add map with all elements combined
    val countMore = mapOf(Pair(20, "twenty"), Pair(30, "thirty"))
    count.putAll(countMore)
    println(count)
    // remove an element based on key
    count.remove(2)
    println(count)
    // replace a value in specific key
    count.replace(1, "oneone")
    println(count)
    // clean a map
    count.clear()
    println(count)
}

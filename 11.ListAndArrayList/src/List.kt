fun main(args: Array<String>) {
    // omitted type cast the elements type
    val colors = listOf("blue", "red", "yellow")
    println(colors)
    // allow empty list since type is informed
    val colors2 = listOf<String>()
    println(colors2)
    // allow repeated, but has different index
    val colors3 = listOf("blue", "red", "blue", "green", "blue")
    println(colors3)
    // allow null elements
    val colors4 = listOf("blue", "red", null, "green", null)
    println(colors4)
    // access by index
    println(colors[0])
    println(colors.get(0))
    println(colors.size)
    // throw exception if index is not existent
    // println(colors[5])
}

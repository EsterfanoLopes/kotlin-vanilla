fun main(args: Array<String>) {
    val colors = arrayListOf("blue", "red", "blue", "green")
    // replace element on index
    colors.set(1, "redder")
    println(colors)
    // sublist from a list
    val subColors = colors.subList(1, 3)
    println(subColors)
    println(subColors::class.java)
    // clear
    colors.clear()
    println(colors)
    // check if is empty
    println(colors.isEmpty())
}

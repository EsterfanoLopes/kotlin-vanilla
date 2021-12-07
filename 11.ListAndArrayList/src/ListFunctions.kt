fun main(args: Array<String>) {
    val colors = listOf<String>("blue", "red", "blue", "green")
    println(colors.size)
    // check if element exists
    println(colors.contains("red"))
    println(colors.contains("pink"))
    // check if elements from a list is contained on other list
    val newColors = listOf<String>("red", "green")
    println(colors.containsAll(newColors))
    // get index of specific element
    println(colors.indexOf("green"))
    // get last index of a specific element
    println(colors.lastIndexOf("blue"))
}

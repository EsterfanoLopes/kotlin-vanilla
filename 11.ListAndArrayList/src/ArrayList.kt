fun main(args: Array<String>) {
    // omitted type cast the elements type
    val colors = arrayListOf("blue", "red")
    colors.add("yellow")
    println(colors)
    // allow empty list since type is informed
    val noColors = arrayListOf<String>()
    println(noColors)
    // add an array list to another
    val moreColors = arrayListOf<String>("brown", "pink")
    colors.addAll(moreColors)
    println(colors)
    // remove element
    colors.remove("red")
    println(colors)
    // remove all colors indicated on a list
    colors.removeAll(moreColors)
    println(colors)
    // remove specific index
    colors.removeAt(1)
    println(colors)
    // remove element just remove first found one
    colors.add("red")
    colors.add("blue")
    println(colors)
    colors.remove("blue")
    println(colors)
}

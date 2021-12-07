fun main(args: Array<String>) {
    // Pass through all language safe null checks - Bad practice
    var catName: String? = null
    println(catName!!.length)

    catName = "Fluffy"
    println(catName!!.length)
}

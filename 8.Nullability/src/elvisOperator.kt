fun main(args: Array<String>) {
    var catName: String? = null
    println(catName?: "This cat has no name")

    catName = "Fluffy"
    println(catName?: "This cat has no name")
}

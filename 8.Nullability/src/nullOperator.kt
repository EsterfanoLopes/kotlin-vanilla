fun main(args: Array<String>) {
    var catName: String? = "Chonkers"
    // Not allowed because variable could be null
    //catName.length
    catName = null
    // Allowed because we are verifying if catName is null first
    println(catName?.length)
}

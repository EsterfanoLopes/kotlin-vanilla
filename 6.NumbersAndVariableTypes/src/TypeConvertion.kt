fun main(args: Array<String>) {
    // to long
    val cats = 3
    val longCats = cats.toLong()
    println(cats::class.java)
    println(longCats::class.java)
    println(longCats)
    // smaller types will lead to data corruption
    val people = 7500000000
    val fewPeople = people.toInt()
    println(people::class.java)
    println(fewPeople::class.java)
    println(fewPeople)
}

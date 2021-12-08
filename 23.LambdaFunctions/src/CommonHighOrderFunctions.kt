fun main(args: Array<String>) {
    val clients: List<String> = listOf("Alice", "Bob", "Carol")

    // foreach
    clients.forEach{ client -> println("Hello $client") }
    // filter
    clients
        .filter { client -> client.length < 5 }
        .forEach{ client -> println("Hello $client ")}
    // map [creates a new collection]
    val sizes = clients.map { it.length }
    println(sizes)
    // sortedBy
    val sorted = clients.sortedBy { client -> client.length }
    println(sorted)
    // maxBy
    val max = clients.maxByOrNull { client -> client.length }
    println(max)
    // minBy
    val min = clients.minByOrNull { client -> client.length }
    println(min)
}


fun main(args: Array<String>) {
    var count = hashMapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    // size
    println("This map has a size of ${count.size}")
    // check if key exists
    println("Does the map have the key 2? : ${count.containsKey(2)}")
    println("Does the map have the key 5? : ${count.containsKey(5)}")
    // check if value exists
    println("Does the map have the value \"one\"? : ${count.containsValue("one")}")
    println("Does the map have the value \"five\"? : ${count.containsValue("five")}")
    // check if the map is empty
    println("Is the map empty? : ${count.isEmpty()}")
    println("Is the map not empty? : ${count.isNotEmpty()}")
}

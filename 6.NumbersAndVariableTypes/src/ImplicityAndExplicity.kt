fun main(args: Array<String>) {
    // Implicity
    var cats = 3
    println(cats::class.java)
    var money = 5.99
    println(money::class.java)
    // Explicity
    var dogs: Byte = 5
    println(dogs::class.java)
    var days: Short = 2000
    println(days::class.java)
    var life: Long = 42
    println(life::class.java)
    var newLife = 42L
    println(newLife::class.java)
    var moreMoney = 6.99F
    println(moreMoney::class.java)
}

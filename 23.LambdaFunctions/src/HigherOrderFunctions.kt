fun main(args: Array<String>) {
    val names = arrayListOf<String>("Alice", "Bob", "Carol", "Dan")
    val lambda = {name: String -> println("Hello $name")}
    // using from var
    sayHello(names, lambda)
    // declaring on function call
    sayHello(names, {name: String -> println("Hello $name")})
    // passing outside function signature
    sayHello(names) {name: String -> println("Hello $name")}
}

fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit) {
    for (name in names) {
        doSomething(name)
    }
}

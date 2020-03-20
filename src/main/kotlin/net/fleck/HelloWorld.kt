package net.fleck

class HelloWorld {
    fun hello(name:String) = "Hello $name"
    fun anotherFunction(name: String) = "This is a good change: $name"
    fun endlessForLoop() {
        for (x in 0 until 10 step -2)
            println("Printing $x")
    }
}
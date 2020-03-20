package net.fleck

class HelloWorld {
    fun hello(name:String) = "Hello $name"
    fun anotherFunction(name: String) = "This is a good change: $name"
    fun endlssForLoop() {
        for (x in 5 until 2 step 2)
            println("Printing ${x+10}")
    }
}
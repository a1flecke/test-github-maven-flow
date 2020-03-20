package net.fleck

class HelloWorld {
    fun hello(name:String) = "Hello $name"
    fun anotherFunction(name: String) = "This is a good change: $name"
    fun uselessIfElse() :String = if(true)
            "It was true"
    else
            "False"
}
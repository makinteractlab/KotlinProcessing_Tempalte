// Example of Kotlin class called by Java code
class Foo constructor(username: String) 
{
    val username : String

    init {
        this.username = username
        println("Foo says $username")
    }
}
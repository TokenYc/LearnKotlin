fun main() {
    println(Test().name)
    var test = Test()
    test.age = "123"
    test.printAge()

}

class Test {
    lateinit var age: String
    var name: String = "swz"
        get() {
            return "name is $field"
        }

    fun printAge() {
        if (this::age.isInitialized) {
            println("age is $age")
        }
    }
}
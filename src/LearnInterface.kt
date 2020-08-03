fun main() {
    val myClass = MyClass()
    myClass.test1()
    myClass.test2()
    println("parentProperty-->${myClass.parentProperty}")
}

interface MyInterface {
    val parentProperty: String
        get() = "111"

    fun test1()

    fun test2() {
        println("invoke test2")
    }
}

class MyClass : MyInterface {
    override val parentProperty: String
        get() = "2222"

    override fun test1() {
        println("invoke test1")
    }


}
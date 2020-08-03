fun main() {
//    Person("yc", 11).print()
    println(Student("yc").mName)
}

open class Person(var name: String, var age: Int) {

    open val mName = "my name is $name"

    init {

    }

    constructor(name: String) : this(name, 12) {

    }

    open fun print(){
        println("name-->${name},age-->${age}")
        println("mName-->${mName}")
    }
}

class Student(name: String) : Person(name) {

    override val mName: String
        get() = "重写属性的get方法"

    override fun print() {
        println("student name-->${name},age-->${age}")
        println("student mName-->${mName}")
    }
}
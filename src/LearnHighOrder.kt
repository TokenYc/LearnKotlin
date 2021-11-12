fun main() {

    val learnHighOrder = LearnHighOrder()
    learnHighOrder.initPerson {
        val firstName = "yang"
        val secondName = "chen"
        name = "$firstName $secondName"
        upCaseName()
        age = 11
    }
}

class LearnHighOrder {

    fun initPerson(block: Person.() -> Unit) {
        val person = Person()
        person.block()
        println("his name is ${person.name} age is ${person.age}")
    }

    class Person {
        var name: String = ""
        var age: Int = 0

        fun upCaseName() {
            name = name.toUpperCase()
        }
    }
}


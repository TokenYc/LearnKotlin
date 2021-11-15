fun main() {

    val learnHighOrder = LearnHighOrder()

    val initPerson = LearnHighOrder.InitPerson()


    /**
     * 直接写lambda表达式
     */
    learnHighOrder.initPerson {
        println("直接使用lambda表达式")
        val firstName = "yang"
        val secondName = "chen"
        name = "$firstName $secondName"
        upCaseName()
        age = 11
    }

    /**
     * 使用声明的lambda表达式
     */
    val lambda2 = { person: LearnHighOrder.Person ->
        person.apply {
            println("使用声明的lambda表达式")
            val firstName = "yang"
            val secondName = "chen"
            name = "$firstName $secondName"
            upCaseName()
            age = 11
        }
        Unit
    }

    learnHighOrder.initPerson(lambda2)

    /**
     * 实现函数接口
     */
    learnHighOrder.initPerson(initPerson)

    /**
     * 匿名函数实现
     */
    learnHighOrder.initPerson(fun(person) {
        person.apply {
            println("使用匿名函数")
            val firstName = "yang"
            val secondName = "chen"
            name = "$firstName $secondName"
            upCaseName()
            age = 11
        }
        return
    })

//
//    fun test(block: String.() -> Unit) {
//        block.invoke("test")
//    }
//
//    test(fun(test: String) {
//        println(test.length)
//    })
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


    class InitPerson : (Person) -> Unit {
        override fun invoke(p1: Person) {
            println("使用继承函数类型的类")
            p1.apply {
                val firstName = "yang"
                val secondName = "chen"
                name = "$firstName $secondName"
                upCaseName()
                age = 11
            }
        }

    }
}


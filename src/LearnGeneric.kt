//在java中extends使类型有了上界，上界使得类型是协变的。协变的含义是：可以读取到上界类型的数据，不可写。
//在java中super使类型有了下界，下界使得类型是异变的。异变的含义是：可以写下界以及继承下界的类型，不可读。
//讲上下界很好的一篇文章。
//学习泛型
fun main() {
    val generic = GenericMethod()
    val result = generic.box(11)
    println("genericMethod: $result")

    val genericClass = GenericClass<String>("hahaha")
    println("genericClass: ${genericClass.test}")

    val managerChild = object : Manager<Child> {
        override fun manage(): Child {
            return Child()
        }
    }
    val managerParent :Manager<Parent> = managerChild
}

//在函数中使用泛型参数
class GenericMethod {
    fun <T> box(t: T): T {
        return t
    }
}

//泛型类的使用
class GenericClass<T>(val test: T) {

}

open class Parent {

}

class Child : Parent() {

}

interface Manager<out T> {
    fun manage(): T
}

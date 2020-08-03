fun main() {
    learnWhen()
}

fun learnWhen() {
    var a = 1
    when (a) {
        in 1..10 -> println("when a in 1..10")
        1 -> println("when a =1")
        2 -> println("when a = 2")
        else -> {
            println("when else")
        }
    }
}
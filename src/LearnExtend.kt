import kotlin.random.Random


fun main() {
    val test = ExtendTest()
    println("value-->${test.doRandom()}")

}


class ExtendTest {
    val Random.lala: Int
        get() = 11

    fun Random.hhh(): Int {
        return lala
    }

    fun doRandom(): Int {
        val random = Random(10)
        return random.hhh()
    }
}
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray
import java.util.*

fun main() {

    val a = Array(3) { it * 1 }

    val b = IntArray(3) { it * 1 }

    println(a::javaClass.get().toString() + " " + a.contentToString())

    println(b::javaClass.get().toString()+ " " + b.contentToString())

}

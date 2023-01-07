import java.lang.IllegalArgumentException
import java.util.IllegalFormatCodePointException


class Person(
    private val firstName: String,
    private val familyName: String
) {
    inner class Possession(val description: String) {
        fun showOwner() = println(fullName())

        // 외부 클래스 인스턴스
        fun getOwner() = this@Person
    }
    fun fullName() = "$firstName $familyName"
}

fun main() {
    val person = Person("Black", "raven")
    // println(person.firstName) Error
    println(person.fullName())

    class Point(val x:Int, val y: Int) {
        fun shift(dx: Int, dy:Int): Point = Point(x + dx, y + dy)
        override fun toString() = "($x, $y)"
    }

    val p = Point(10, 10)
    println(p.shift(-1, 3))
}

fun foo() {
    // 지역 클래스
//    println(Point(0, 0))
}
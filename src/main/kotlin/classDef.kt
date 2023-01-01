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
}
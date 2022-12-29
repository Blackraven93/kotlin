import java.lang.IllegalArgumentException
import java.util.IllegalFormatCodePointException

class Person(
    private val firstName: String,
    private val familyName: String
) {
    fun fullName() = "$firstName $familyName"
}

fun main() {
    val person = Person("Black", "raven")
    // println(person.firstName) Error
    println(person.fullName())
}
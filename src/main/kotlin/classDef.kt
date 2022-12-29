import java.lang.IllegalArgumentException
import java.util.IllegalFormatCodePointException

class Person(var firstName: String, fullName: String) {
    var familyName: String


    fun fullName() = "$firstName $familyName"



    init {
        val names = fullName.split(" ")
        if (names.size !=2 ) {
            throw IllegalArgumentException("Invalid name: ${fullname()}")
        }
        firstName = names[0]
        familyName = names[1]
    }
}

fun main() {
    val person = Person("Black Raven")
    println(person.firstName)
}
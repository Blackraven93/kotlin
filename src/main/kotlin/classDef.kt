import java.lang.IllegalArgumentException
import java.util.IllegalFormatCodePointException

class Person {
    val fullName: String
    constructor(firstName: String, familyName: String):
            this("$firstName $familyName")
    constructor(fullName: String) {
        this.fullName = fullName
    }
}

fun main() {
    val person = Person("Black Raven")

}
import java.lang.Exception
import java.lang.NumberFormatException

fun readInt(default: Int) = try {

    readLine()!!.toInt()

    } catch (e: NumberFormatException) {
        default
}
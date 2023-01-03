fun isLetterString(s: String): Boolean {
    if (s.isEmpty()) return false
    for (ch in s) {
        if (!ch.isLetter()) return false
    }
    return true
}

fun isBooleanString(s: String?) = s == "false" || s == "true"
fun describeNumber(n: Int?) = when (n) {
    null -> "null"
    in 0..10 -> "small"
    in 11..100 -> "large"
    else -> "out of range"
}
fun isSingleChar(s: String?) = s != null && s.length == 1

//fun readInt(): Int? {
//    val tmp = readLine()
//
//    return if ( tmp != null ) tmp.toInt() else null
//}

fun greeting(name: String?) {
    println("Hello ${name ?: "Unknown"}")
}

fun main() {
    println(isLetterString("abc"))
    println(describeNumber((24)))
    println(isSingleChar("fdf"))
    println(readLine()?.toInt()?.toString(16))
    // Error
    //    println(isLetterString(null))
    // 엘비스 연산자 : ?:
    greeting(name = null)

    // 우선순위
    // or, and(중위 연산자) > :? > in, !in > 비교 동등, ||, &&
}

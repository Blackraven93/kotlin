import kotlin.reflect.typeOf

fun range() {
    val chars = 'a'..'z'
    val num = 22
    println(num in 10..40)
    println(num !in 10..40)
    println(num until  40)
    println(5 in 1 downTo 10)
    println(10 downTo 1 step 2)
    val condition = 1..10 step 2
    println(condition)
    println(hexDigit(5) is Char)
}

fun hexDigit(n: Int) = when(n)  {
    in 0..9 ->  '0' + n
    in 10..15 -> 'A' + n - 10
    else ->  '?'
}

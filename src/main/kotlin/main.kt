import kotlin.math.PI
import range
import loop

fun circleArea(radius: Double):Double {
    return PI*radius*radius
}

fun readInt(): Int {
    return readLine()!!.toInt()
}

fun swap(s: String, from: Int, to:Int): String {
    val chars = s.toCharArray()
    val tmp = chars[from]
    chars[from] = chars[to]
    chars[to] = tmp
    return chars.concatToString()
}

fun main() {
    println(swap("Hello", 1, 2))
    println(swap("Hello", from = 1, to = 2))
    println(swap("Hello", to = 3, from = 0))
    println(swap("Hello", 1, to = 3))
    println(swap(s = "Hello", 1, to = 3))
    // 인자 순서를 변경할 시 입력하려면 모두 입력하던가
    // 아니면 뒤의 타입을 생략해도 괜찮다.
//    println(swap(s = "Hello", 1, from = 3))

    range()
    loop()
}



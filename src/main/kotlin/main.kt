fun main() {
    var a = 1
    println(a++)
    println(a)
}

fun sum() {
    println("Please type two number")
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()
    println(x + y)
}
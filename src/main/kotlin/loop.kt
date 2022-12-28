import kotlin.random.*

fun loop() {
    val num = Random.nextInt(1, 101)
    var guess = 0

    while (guess != num) {
        guess = readLine()!!.toInt()
        if (guess < num) println("Too small")
        else if (guess > num) println("Too big")
    }

    println("Right: it's $num")
}

fun forLoop() {
    val sequenceSquare = IntArray(10) { it * it }
    var sum = 0

    for (x in sequenceSquare) {
        sum += x
    }

    println("Sum: $sum")
}
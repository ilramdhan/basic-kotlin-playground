fun main() {
    println("for dengan range")
    println("================")
    for (i in 1..3) {
        println("Nilai: $i")
    }

    println()
    println("for dengan range variable")
    println("================")
    val range = 1..3
    for (i in range) {
        println("Nilai: $i")
    }

    println()
    println("for dengan list")
    println("================")
    val list = listOf("abc", "def", "ghi")
    for (i in list) {
        println("Nilai: $i")
    }

    println()
    println("for dengan list.indices")
    println("================")
    for (i in list.indices) {
        println("Nilai: ${list.get(i)} Index: $i")
    }

    println()
    println("for dengan list.withIndex()")
    println("================")
    for ((index, value) in list.withIndex()) {
        println("Nilai: $value Index: $index")
    }

    println()
    println("for dengan forEach()")
    println("================")
    list.forEach { value ->
        println("Nilai: $value")
    }

    println()
    println("for dengan forEachIndexed()")
    println("================")
    list.forEachIndexed { index, value ->
        println("Nilai: $value Index: $index")
    }

    println()
    println("contoh let")
    println("================")
    val string: String? = null
    if (string != null) { println(string) }
    string?.let { value -> println(value) }

    println()
    println("contoh ternary")
    println("================")
    val a = true
    val b = 0
    val c = 1
    val value = if (a) b else c
    val int: Int? = null
    val value2 = int ?: 0

    println()
    println("while-do")
    println("================")
    var number = 0
    while (number < 10) {
        println("value: $number")
        number += 3
    }

    println()
    println("do-while")
    println("================")
    var number2 = 0
    do {
        println("value: $number2")
        number2++
    } while (number2 < 10)

    println()
    println("break")
    println("================")
    for (i in 1..100) {
        println("Nilai: $i")
        if (i == 10) {
            break
        }
    }

    println()
    println("continue")
    println("================")
    var i = 0
    while (i < 7) {
        if (i == 4) {
            i++
            continue
        }
        println(i)
        i++
    }
}
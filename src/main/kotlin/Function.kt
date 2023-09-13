fun main() {
    // block code yg akan dieksekusi
    println("ini adalah function")

    val result = add(secondNumber = 2, firstNumber = 1)
    val result2 = add(firstNumber = 9)
    val result3 = add(secondNumber = 10)
    val result4 = add()
    println("hasil penjumlahan adalah = $result")

    val result5 = sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("hasil sum adalah: $result5")

    val sum2: (Int, Int) -> Int = { a: Int, b: Int ->
        a + b
    }

    val result6 = sum2(10, 20)
    println("hasil sum lambda adalah: $result6")
}

// input -> proses -> output
// jika output tidak didefinisikan, maka output nya otomatis diisi dengan void (java) di kotlin adalah Unit
fun add(firstNumber: Int = 0, secondNumber: Int = 0): Int {
    val result = firstNumber + secondNumber
    return result
}

fun sum(vararg numbers: Int): Int {
    var result = 0
    numbers.forEach { number ->
        result += number
    }
    return result
}
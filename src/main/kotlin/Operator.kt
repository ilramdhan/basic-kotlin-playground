fun main() {
    val first = 3
    val second = 2

    val firstString = "saya"
    val secondString = "adalah"
    val thirdString = "ultraman"

    val plus = first + second
    val minus = first.minus(second)
    val div = first.div(second)
    val times = first.times(second)
    val mod = first.mod(second)

    val completedString = firstString.plus(" ").plus(secondString).plus(" ").plus(thirdString)

    println("value ($first + $second): $plus")
    println("value ($first - $second): $minus")
    println("value ($first / $second): $div")
    println("value ($first * $second): $times")
    println("value ($first % $second): $mod")
    println("value ($firstString + $secondString + $thirdString): $completedString")

    val and1 = true && true
    val and2 = true && false
    val and3 = false && false
    val and4 = false && true

    val or1 = true || true
    val or2 = true || false
    val or3 = false || false
    val or4 = false || true

    println("true && true: $and1")
    println("true && false: $and2")
    println("false && false: $and3")
    println("false && true: $and4")
    println()
    println("true || true: $or1")
    println("true || false: $or2")
    println("false || false: $or3")
    println("false || true: $or4")
}
fun main() {
    val bilangan = 9

    println(checkGenap(bilangan))
}

fun isGenap(angka: Int): Boolean {
    return angka % 2 == 0
}

fun checkGenap(bilangan: Int): String {
    if (isGenap(bilangan)) {
        return "$bilangan adalah bilangan genap"
    } else {
        return "$bilangan adalah bilangan ganjil"
    }
}
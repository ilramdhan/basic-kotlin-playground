import java.lang.NumberFormatException

fun checkNumber(angka: Int, condition:(Int) -> Boolean) : String {
    return if (condition(angka)) "Genap" else "Ganjil"
}

fun getInputAngka() : Int? {
    println("masukan angka")
    val input = readLine()
    return try {
        input?.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun main() {
    val angka = getInputAngka()
    if (angka != null) {
        val result = checkNumber(angka) { it % 2 == 0 }
        println("hasil : $result")
    } else {
        println("masukan angka yang valid")
    }
}
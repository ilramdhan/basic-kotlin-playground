fun main() {
    print("Masukkan angka: ")
    val number = readln().toIntOrNull()
    if (number!=null) {
        val jenisBilangan = ganjilGenap(number)
        println("$number adalah angka $jenisBilangan")
    } else {
        println("Tidak valid")
    }
}

fun ganjilGenap(number: Int): String {
    return if (number%2==0) {
        "Genap"
    } else {
        "Ganjil"
    }
}
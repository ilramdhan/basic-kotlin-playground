fun main() {
    val input = 0
    println(
        cekGanjilGenap2(
            input = 1,
            checkNull = ::checkNull,
        )
    )
    println(
        cekGanjilGenap2(input = null) { input ->
            checkNull(input)
        }
    )
}

fun cekGanjilGenap2(
    input: Int?,
    checkNull: (Int?) -> Boolean,
): String {
    return if (!checkNull(input)){
        if(input!! % 2 == 0){
            "genap"
        } else {
            "ganjil"
        }
    }else{
        "bukan bilangan bulat"
    }
}

fun mintaInput2(): Int? {
    print("Masukan bilangan bulat: ")
    val input = readln().toIntOrNull()
    return input
}

fun checkNull(input: Int?): Boolean {
    return input == null
}
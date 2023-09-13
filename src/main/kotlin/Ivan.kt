fun cekGanjilGenap(input: Int?): String {
    return if (input != null ){
        if(input % 2 == 0){
            "genap"
        } else {
            "ganjil"
        }
    }else{
        "bukan bilangan bulat"
    }
}

fun mintaInput(): Int? {
    print("Masukan bilangan bulat: ")
    val input = readln().toIntOrNull()
    return input
}

fun main(){
    val hasil = cekGanjilGenap(7)
    println("Hasil: $hasil")
}
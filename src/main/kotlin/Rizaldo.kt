fun main(){
    println(checkIsOddOrEven(
        input = getInput(),
        checkIsNull = ::checkNull
    ))
}

fun checkIsOddOrEven(
    input:Int?,
    checkIsNull : (Int?) -> Boolean
):String{
    return if (!checkIsNull(input)){
        if(input!! % 2 == 0){
            "Genap"
        }else{
            "Ganjil"
        }
    }else{
        "Bukan Bilangan Bulat"
    }
}
fun getInput(): Int? {
    print("input : ")
    return readln().toIntOrNull()
}
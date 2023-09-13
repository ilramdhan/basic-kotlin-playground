fun main(args: Array<String>) {
    val arrayOfMenu = arrayOf(
        "1. Burger",
        "2. Fried Chicken",
        "3. Sweet Ice Tea",
        "4. Coke",
        "5. Ice Cream",
        "6. Sea Food",
    )
    println("Selamat Datang!")
    println("==================")
    println("mau pesan apa?")
    // ubah print menu menjadi perulangan (pilih salah satu: do-while/while-do/for)
    for (i in arrayOfMenu){ println(i) }

    println()
    var indexMenu = 0
    do{
        println(arrayOfMenu[indexMenu])
        indexMenu++
    }while (indexMenu < arrayOfMenu.size )

    println()

    var indexMenu2 = 0
    while (indexMenu2 < arrayOfMenu.size){
        println(arrayOfMenu[indexMenu2])
        indexMenu2++

    }

    println()
    print("pesanan: ")
    val order: Int? = readln().toIntOrNull()



    when {
        order == null -> {
            println("maaf ini bukan java!")
        }
        order < 0 -> {
            println("maaf saya orangnya positif!")
        }
        order in 1..5 -> {
            when (order) {
                1 -> {
                    println("Ini pesanan mu!")
                    println("satu buah Burger!")
                    println("selamat menikmati")
                }
                2 -> {
                    println("Ini pesanan mu!")
                    println("satu buah Fried Chicken!")
                    println("selamat menikmati")
                }
                3 -> {
                    println("Ini pesanan mu!")
                    println("satu buah Sweet Ice Tea!")
                    println("selamat menikmati")
                }
                4 -> {
                    println("Ini pesanan mu!")
                    println("satu buah Coke!")
                    println("selamat menikmati")
                }
                5 -> {
                    println("Ini pesanan mu!")
                    println("satu buah Ice Cream!")
                    println("selamat menikmati")
                }
            }
        }
        else -> {
            println("maaf saya tidak bisa membaca pesananmu!")
        }
    }
}
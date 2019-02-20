package pertemuan4

fun main(args: Array<String>) {
    //whenCondition()
    //withTwoCondition()
    //loopAndCondition()
    //looping()
}

fun looping() {
    /*ada 3 :
    1. for / foreach / foreach indexed;
    2. while;
    3. do while
    4. repeat*/

    /*1. for / foreach / foreach indexed;*/
    (0..10).forEach {

    }
    val names = arrayOf("a", "c", "v", "x...")
    names.forEachIndexed { index, data ->
        if (index == 2)
            println(data)
    }
    names.forEach {
        println(it)
    }
    for (i in 0..10) {

    }

    /*2. while looping*/
    var x = 10
    while (x < 6) {
        println("x = $x")
        x++
    }

    /*3. do while looping*/
    var y = 10
    do {
        println("y = $y")
        y++
    } while (y < 5)

    /*4. repeat*/
    repeat(10) {
        println("x : $it")
    }
}

fun loopAndCondition() {
    val nilaiUlangan = arrayOf(100, 90, 30, 20, 67, 89, 101, 1000)
    when (4) {
        in nilaiUlangan -> println("Ada")
        else -> println("Ga Ada")
    }

    nilaiUlangan.forEach { nilai ->
        when (nilai) {
            in 81..100 -> println("$nilai = A")
            in 71..80, in 1000..10000 -> println("$nilai = B")
            in 61..70 -> println("$nilai = C")
            in 41..60 -> println("$nilai = D")
            in 0..40 -> println("$nilai = E")
            else -> println("$nilai = Pls input 0 to 100 only")
        }
    }
}

fun whenCondition() {
    val x = "EN"
    when (x) {
        "id" -> println("Apa kabar?")
        "en" -> println("How are you?")
        "may" -> println("How are you? May")
        else -> println("I don't know that language yet :(")
    }

    /*When vs IF ELSE Condition*/
    val nilai = 100

    when (nilai) {
        in 81..100 -> {
            /*jika statement lebih dari 1 bari, maka gunakan body {...}*/
            println("Nilai : A")
        }
        in 71..80 -> println("Nilai : B")
        in 61..70 -> println("Nilai : C")
        in 41..60 -> println("Nilai : D")
        in 0..40 -> println("Nilai : E")
        else -> println("Masukkan range nilai 0-100")
    }

    /*jika statement hanya 1 baris kita bisa tanpa menggunakan body {...}*/
    val condition1: Boolean = nilai in 81..100
    if (condition1)
        println("Nilai : A")
    else if (nilai in 71..80) {
        println("Nilai : B")
    } else if (nilai in 61..70) {
        println("Nilai : C")
    } else if (nilai in 41..60) {
        println("Nilai : D")
    } else if (nilai in 0..40) {
        println("Nilai : E")
    } else {
        println("Masukkan range nilai 0-100")
    }

    /*contoh simpel When vs IF ELSE*/

    val jk = "L"
    when {
        jk == "L" -> println("Ganteng")
        jk == "P" -> println("Cantik")
        else -> println("Lala yeye")
    }

    when (jk) {
        "L" -> println("Ganteng")
        "P" -> println("Cantik")
        else -> println("Lala yeye")
    }

    if (jk == "L")
        println("Ganteng")
    else if (jk == "P")
        println("Cantik")
    else
        println("Lala yeye")

    if (jk == "L") {
        println("Ganteng")
    } else {
        println("Cantik")
    }

    when (jk) {
        "L" -> println("Ganteng")
        "P" -> println("Cantik")
    }

    if (jk == "L") {
        println("Ganteng")
    }

    when (jk) {
        "L" -> println("Ganteng")
    }
}

fun withTwoCondition() {
    /*with two condition*/
    /*jika JK = laki &&(AND) sudah menikah, maka ...*/
    val jK = "L"
    val hasMenikah = true

    var gaji = 0
    var tunjangan = 0
    val hasAnak = true
    val anak = 0

    if (jK == "L" || hasMenikah && !hasAnak) {
        gaji = 1000000
        tunjangan = 500000
    } else if (jK == "L" || hasMenikah && (hasAnak && anak <= 0)) {
        gaji = 1000000
        tunjangan = 100000
    } else if (jK == "L" || hasMenikah && (hasAnak && anak in 1..2)) {
        gaji = 1000000
        tunjangan = 200000
    } else if (jK == "L" || hasMenikah && (hasAnak && anak in 3..4)) {
        gaji = 1000000
        tunjangan = 300000
    } else if (jK == "L" || !hasMenikah) {
        gaji = 1000000
        tunjangan = 100000
    } else if (jK == "P" || hasMenikah) {
        gaji = 2000000
        tunjangan = 1000000
    } else if (jK == "P" || !hasMenikah) {
        gaji = 2000000
        tunjangan = 500000
    }

    val total = gaji + tunjangan
    println("Dia adalah $jK, maka Gaji = $gaji & Tunjuangan = $tunjangan")
    println("Sehingga total = $total")

    when {
        jK == "L" || hasMenikah && !hasAnak -> {
            gaji = 1000000
            tunjangan = 500000
        }
        jK == "L" || hasMenikah && (hasAnak && anak <= 0) -> {
            gaji = 1000000
            tunjangan = 100000
        }
        jK == "L" || hasMenikah && (hasAnak && anak in 1..2) -> {
            gaji = 1000000
            tunjangan = 200000
        }
        /*bla bla bla*/
    }

    println("Dia adalah $jK, maka Gaji = $gaji & Tunjuangan = $tunjangan")
    println("Sehingga total = ${gaji + tunjangan}")
}
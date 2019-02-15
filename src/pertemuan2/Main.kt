package pertemuan2

fun main(args: Array<String>) {
    15.tambah(10)
    jumlah(15, 10)
}

fun jumlah(x: Int = 0, y: Int = 0) {
    val hasilJumlah = x.tambah(y)
    println("Hasil $x + $y = $hasilJumlah")
}


//extension function
fun Int.tambah(a: Int) {
    val hasilJumlah = this + a
    println("Hasil $this + $a = $hasilJumlah")
}

//top level function
fun bagi(x: Int, y: Int) {
    val hasil = x / y
    println("Hasil $x : $y = $hasil")
}

/*
inline fun<reified T> T.logD(msg: String) {
    val tag = T::class.java.simpleName
    println("$tag, $msg")
}*/

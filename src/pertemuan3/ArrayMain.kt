package pertemuan3

import java.util.*

fun main(args: Array<String>) {
    //menampilkan data sebuah array pada console
    println("Array angka : " + Arrays.toString(arrayAngka))
    println("Array nama : " + Arrays.toString(arrayNama))

    //menampilkan data array pada console berdasarkan index
    println("Nama ke 1 : " + arrayNama[0])

    //merubah data dari array berdasarkan index
    arrayNama[1] = "Upin"
    println("Nama ke 2 : ${arrayNama[1]}")

    //menampilkan size(jumlah data) dari sebuah array
    println("Jumlah data nama : ${arrayNama.size} data")

    //iterasi/perulangan pada array
    //#1 tanpa index
    arrayNama.forEach { nama ->
        println("Nama : $nama")
    }
    //#2 dengan index
    arrayNama.forEachIndexed { i, nama ->
        println("Nama ke-$i : $nama")
    }

    //extension array
    println("Data pertama dari nama : ${arrayNama.first()}")
    println("Data terakhir dari nama : ${arrayNama.last()}")

    //array convert to list (mutable or immutable)
    val listNama = arrayNama.toList()

    val arr2d = arrayOf(arrayOf(1, 2, null, 5), arrayOf(4, 5, 6, 4))
    println("nampilin angka 4 di array pertama : ${arr2d[0][2]}")
}

/**
 * Array : Sekumpulan data yang sejenis.
 * Array memiliki size(jumlah data) & index(dimulai dari 0)
 *
 * Contoh penulisan array :
 * */
val arrayAngka = arrayOf(1, 3, 4, 323)
val arrayNama = arrayOf("Ilham", "Putra", "Putri")
val arrayOfBoolean = arrayOf(true, false, false, true)
//dst...

package pertemuan3

fun main(args: Array<String>) {
    //menampilkan data dari sebuah List pada console
    println("List angka : $listAngka")
    println("List nama : $listNama")

    //menampilkan/mengakses data list berdasarkan index
    println("Nama kedua = ${listNama[1]}")

    //manipulasi list dinamis
    println("List dinamis = $listDinamis")
    listDinamis.add("X")
    listDinamis.add("y")
    listDinamis.remove("a")
    listDinamis.remove("A")
    listDinamis.add("8awawdawd")
    listDinamis.addAll(listNama)
    println("List dinamis = $listDinamis")

    //converto list to array
    val arrayNama = listDinamis.toTypedArray()

    //replace data of list by condition
    listDinamis.replaceAll {
        //mengganti semua data yg sama dengan `A` jadi `XY`
        return@replaceAll if (it == "A") {
            "XY"
        } else {
            it
        }
    }
    println("After replace : $listDinamis")

    val newList = listDinamis.map { it.toLowerCase() }.sortedDescending()
    println("After lower case : $newList")
    listDinamis.clear()
    println("List dinamis : $listDinamis")
}

/**
 * List : sekumpulan data yang sejenis. Mirip dengan array hanya sj List lebih dinamis
 * kita bisa melakukan penambahan data, menghapus, merubah, dll.
 * Sama seperti array, List juga memiliki size & index.
 *
 * Contoh penulisan List :
 * */
val listAngka = listOf(1, 2, 4, 34, 5, 0)
val listNama = listOf("Ilham", "A", "B", "C", "Dede", "dll")
//mutable list/list dinamis
val listDinamis = mutableListOf("A", "B", "C", "D", "dst...", "A")
//dst...
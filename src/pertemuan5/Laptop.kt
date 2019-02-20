package pertemuan5

class Laptop(
    private val warna: String = "",
    private val ukuranLayar: Double = 0.0
) {
    private val merek = "Apple Macbook Pro"
    private val harga = 1000
    private val ram = 8
    private val storage = 128
    private val vga = "1,5 GB Inter HD"

    fun printLaptop() {
        println("Merek : $merek")
        println("Warna : $warna")
        println("Uukuran Layar : $ukuranLayar Inc")
        println("Harga : Rp $harga")
        println("Memori : $ram GB")
        println("Storage : $storage GB")
        println("VGA : $vga")
    }
    /*add other functions here*/
}
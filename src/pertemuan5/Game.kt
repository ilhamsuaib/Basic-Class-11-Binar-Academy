package pertemuan5

data class Game(
    val name: String = "",
    val size: Double = 0.0,
    val difficulty: Int = 0
) {
    fun showGame() {
        println("Show Game")
        println("Name : $name")
        println("Size : $size GB")
        println("Diff : $difficulty stars")
        laptop()
    }

    private fun laptop() {
        val myLaptop: Laptop = Laptop(ukuranLayar = 12.0, warna = "Putih")
        println(myLaptop.printLaptop())
    }
}
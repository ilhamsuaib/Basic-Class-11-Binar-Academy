package pertemuan5

fun main(args: Array<String>) {
    /*val myLaptop: Laptop = Laptop(ukuranLayar = 12.0, warna = "Putih")
    println(myLaptop.toString())*/

    val pubg: Game? = Game("BUBG")
    val ml = Game("Mobil Lejen")

    /*pubg?.showGame()
    ml.showGame()*/

    val games = arrayOf(pubg, ml)

    games.forEach {
        it?.showGame()
    }
}
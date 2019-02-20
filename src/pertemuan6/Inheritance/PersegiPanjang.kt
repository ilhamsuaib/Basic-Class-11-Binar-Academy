package pertemuan6.Inheritance

class PersegiPanjang(
    private val panjang: Int,
    private val lebar: Int
) : BangunDatar() {

    override fun info() {
        println("Persegi Panjang, dimana :")
        println("P = $panjang")
        println("L = $lebar")
        println("Maka : ")
    }

    override fun keliling() {
        val keliling = 2 * (panjang + lebar)
        println("Keliling (K)   = 2 (P + L)")
        println("               = $keliling")
    }

    override fun luas() {
        val luas = panjang * lebar
        println("Luas (L)   = P.L")
        println("           = $luas")
    }
}
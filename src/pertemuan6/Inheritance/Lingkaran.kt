package pertemuan6.Inheritance

class Lingkaran(private val r: Int) : BangunDatar() {

    override fun info() {
        println("Lingkaran, dengan :")
        println("r      = $r")
        println("phi    = 3.14")
        println("Maka :")
    }

    override fun keliling() {
        val keliling = 3.14 * (r * 2)
        println("Keliling (K)   = phi . d")
        println("               = $keliling")
    }

    override fun luas() {
        val luas = 3.14 * (r * r)
        println("Luas (L)   = phi . (r.r)")
        println("           = $luas")
    }
}
package pertemuan6.Inheritance

fun main(args: Array<String>) {
    /*cara konvensional
    val persegiPanjang = PersegiPanjang(4, 5)
    persegiPanjang.info()
    persegiPanjang.luas()
    persegiPanjang.keliling()*/

    /** kotlin style
     * use like this if u use object once */
    PersegiPanjang(4, 5).apply {
        info()
        luas()
        keliling()
    }

    /* write like this if u use object more then one times */
    val lingkaran = Lingkaran(7)
    lingkaran.apply {
        info()
        luas()
    }

    /*kode tambahan...*/

    lingkaran.keliling()
}
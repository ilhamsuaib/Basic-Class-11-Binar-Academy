package pertemuan6.Interface

interface Login {
    fun validasiEmail(email: String): Boolean {
        println("lala yeyey")
        return true
    }

    fun loginUser(username: String, password: String)
}
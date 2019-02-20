package pertemuan6.Interface

fun main(args: Array<String>) {
    val login = LoginImpl()
    login.validasiEmail("ilhamsuaib10@gmail.com")
    login.loginUser("ilhamsuaib10@gmail.com", "12345")
}
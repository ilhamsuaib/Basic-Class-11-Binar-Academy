package pertemuan6.Interface

class LoginImpl : Login {

    override fun validasiEmail(email: String): Boolean {
        /*implementasikan logic cek email valid atau gaknya di sini
        jika valid maka return true, jika tidak maka return false. anggap aja valid*/
        println("validating $email...")
        return true
    }

    override fun loginUser(username: String, password: String) {
        /*implementasikan logic uk login yaitu cek username & password di database*/
        println("checking user with username = $username & passwd = $password...")
    }
}
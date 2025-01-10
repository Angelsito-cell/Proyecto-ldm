
fun main() {
    ej6()
}

fun variable(): String {
    val c = "aitortilla"
    return c
}

fun comprobar_c(c: String) {
    println("Introduzca la contraseña: ")
    while (true) {
        val intento = readLine()!! // Lee la entrada del usuario
        if (intento != c) {
            println("La contraseña no es correcta, introduzcala de nuevo.")
        } else {
            println("La contraseña es correcta.")
            break // Sal del bucle cuando la contraseña sea correcta
        }
    }
}

fun ej6() {
    val contraseña = variable() // Declarar correctamente la variable
    comprobar_c(contraseña)
}

fun ej18(){

    ej18()
}

fun main(){

    println("Introduzca su nombre de usuario: ")

    val usuario = readln()

    val indice  = 0

    val nombre1 = usuario.substring(0, indice) + usuario[indice].uppercase() + usuario.substring(indice + 1)
    val nombre2 = usuario.uppercase()
    val nombre3 = usuario.lowercase()

    println(nombre1)
    println(nombre2)
    println(nombre3)

}
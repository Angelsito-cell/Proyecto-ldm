fun main() {

    ej21()
}

fun pedirpalabra(): String {

    var nombre : String? = null
    while (nombre.isNullOrBlank()) {
        println("Introduza una palabra: ")
        nombre =  readLine()
    }

    return nombre
}

fun ej21() {

   val name = pedirpalabra()
    for (i in 0..10){
        println(name)
    }
}
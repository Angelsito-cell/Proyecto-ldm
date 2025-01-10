fun main() {

    ej22()
}

fun ej22() {

    println("Introduce una frase: ")
    val frase = readln()
    println("Introduce una letra: ")
    val letra = readln()

    if (letra.length > 1){

        println("Solo puedes introducir un valor")
        return
    }

    var charletra = letra[0]

    if (charletra in setOf('a', 'e', 'i', 'o', 'u')) {

        val frase1 = frase.replace(charletra, charletra.uppercaseChar())
        println(frase1)
    }
    else {
        println("La letra introducida no puede ser diferente de una vocal")
    }

}
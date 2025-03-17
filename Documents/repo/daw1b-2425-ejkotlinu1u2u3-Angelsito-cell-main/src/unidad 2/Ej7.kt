fun main() {
    ej7()
}

fun ej7() {
    val num1 = pedirDividendo()
    val num2 = comprobarDivisor()
    val resultado = div(num1, num2)
    println("El resultado es: $resultado")
}

fun pedirDividendo(): Int {
    println("Introduzca un dividendo: ")
    while (true) {
        val input = readLine()
        try {
            return input?.toInt() ?: throw IllegalArgumentException("Entrada no válida.")
        } catch (e: NumberFormatException) {
            println("Por favor, introduce un número válido.")
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }
}

fun comprobarDivisor(): Int {
    println("Introduce un divisor: ")
    while (true) {
        val input = readLine()
        try {
            val num2 = input?.toInt() ?: throw IllegalArgumentException("Entrada no válida.")
            if (num2 == 0) {
                throw IllegalArgumentException("**ERROR** El divisor no puede ser 0")
            }
            return num2
        } catch (e: NumberFormatException) {
            println("Por favor, introduce un número válido (pista: Mayor que 0).")
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }
}

fun div(num1: Int, num2: Int): Double {
    return num1.toDouble() / num2
}

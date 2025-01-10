fun main() {
    ej12()
}

fun ej12() {
    println("Introduzca su peso en kg: : ")
    val peso: Float = readln().toFloatOrNull() ?: 0f

    println("Introduzca su altura en centímetros:  ")
    val altura: Float = readln().toFloatOrNull() ?: 0f

    val alturareal = altura / 100.0f

    val imc = peso / (alturareal * alturareal)
    val imc2 = "%2f".format(imc)

    println("Tu índice de masa corporal es: $imc2")
}
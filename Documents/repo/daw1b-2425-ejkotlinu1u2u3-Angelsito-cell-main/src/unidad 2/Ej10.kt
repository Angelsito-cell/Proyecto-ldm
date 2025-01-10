import `unidad 2`.analizarNivel
import `unidad 2`.analizarPago
import `unidad 2`.pedirNivel

fun pedirNivel(): Double {
    println("Introduzca su puntuación: ")
    return readln().toDouble()
}

fun analizarNivel(nv: Double): String? {
    return when {
        nv == 0.0 -> "Inaceptable"
        nv == 0.4 -> "Aceptable"
        nv >= 0.6 -> "Meteorito"
        else -> null
    }
}

fun analizarPago(nv: Double): Double {
    return 2400 * nv
}

fun main() {
    val niv = pedirNivel()
    val nivelDescripcion = analizarNivel(niv)

    if (nivelDescripcion != null) {
        val pago = analizarPago(niv)
        println("Tu puntuación ha sido de $niv y tienes una calificación de $nivelDescripcion. Tu pago es de $pago")
    } else {
        println("Esa calificación no es válida")
    }
}

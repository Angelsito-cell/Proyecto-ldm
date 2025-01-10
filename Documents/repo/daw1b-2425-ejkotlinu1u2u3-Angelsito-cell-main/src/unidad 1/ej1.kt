fun main() {
    ej04()
}

fun ej04() {
    println("Introduce la temperatura en grados Celsius: ")
    val t: Float = readln().toFloat()
    val f: Float = t * 9 / 5 + 32
    println("La temperatura en Fahrenheit es $f ºF")
}
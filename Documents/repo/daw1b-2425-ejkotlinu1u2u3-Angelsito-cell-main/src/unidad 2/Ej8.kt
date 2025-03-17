
fun main() {
    ej8()
}

fun par_impar(): Int {

    println("Introduce un número: ")

    val num = readln().toInt()

    if (num % 2 == 0){
        println("Tu numero es par")
    }
    else {
        println("Tu numero es impar")
    }

    return num

}




fun ej8() {

    val numero = par_impar()
}
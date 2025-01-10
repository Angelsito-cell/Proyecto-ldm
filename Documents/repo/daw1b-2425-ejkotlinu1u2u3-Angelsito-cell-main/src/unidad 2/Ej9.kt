fun main() {
    ej9()
}

fun preguntarSexo(): String {
    println("Introduzca su sexo (M o F): ")
    val sexo = readln()
    return sexo.capitalize()
}


fun preguntarNombre(): String {
    println("Introduzca su nombre: ")
    val nombre = readln()
    return nombre.capitalize() // Capitalizes the first letter
}


fun comprobarGrupo(sexo: String, nombre: String): String {
    return if (sexo.equals("Hombre", ignoreCase = true)) {
        if (nombre[0].lowercaseChar() in 'a'..'m') {
            "Estás en el grupo B"
        } else {
            "Estás en el grupo A"
        }
    } else {
        if (nombre[0].lowercaseChar() in 'n'..'z') {
            "Estás en el grupo A"
        } else {
            "Estás en el grupo B"
        }
    }
}


fun ej9() {
    val nombre = preguntarNombre()
    val sexo = preguntarSexo()

    println(comprobarGrupo(sexo, nombre))
}


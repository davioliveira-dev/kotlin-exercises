fun main() {
    println(returnStringLength("Davi"))
    println(returnStringLengthViaConsole("Davi"))
}

fun returnStringLength(text: String) = text.length

fun returnStringLengthViaConsole(text: String) = println("A string $text possuí ${text.length} caracteres")


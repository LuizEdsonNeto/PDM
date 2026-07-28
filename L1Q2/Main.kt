fun main() {
    print("Digite um numero: ")
    val numero = readln().toInt()
    val condition = imparPar(numero)

    if (condition) {
        println("$numero é par")
    } else {
        println("$numero é impar")
    }
}

fun imparPar(numero: Int): Boolean {
    return numero % 2 == 0
}

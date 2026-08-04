
class Estudante(
    var nome: String,
    var matricula: String,
    var nota1: Double,
    var nota2: Double
) {


    init {
        if (nota1 < 0 || nota2 < 0) {
            throw Exception()
        }
    }

    fun calcMedia(): Double {
        return (nota1 + nota2) / 2
    }
}
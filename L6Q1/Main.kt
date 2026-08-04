fun main() {

    val listaEstudantes = mutableListOf<Estudante>()

    var opc = 1;
    while (opc != 0) {
        print("Digite a opc: ")
        opc = readln().toInt()

        if (opc == 1) {
            print("Nome:")
            val nome = readln()
            print("Matricula: ")
            val matricula = readln()
            print("Nota 1: ")
            val nota1 = readln().toDouble()
            print("Nota 2: ")
            val nota2 = readln().toDouble()

            val estudante = Estudante(nome, matricula, nota1, nota2)
            listaEstudantes.add(estudante)
        }

        if (opc == 2) {
            for (e in listaEstudantes) {
                println("A media do estudante ${e.nome} é: ${e.calcMedia()}")
            }
        }

    }


}
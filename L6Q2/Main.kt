fun main(){

    val listaRetangulo = mutableListOf<Retangulo>()
    var opc = 1;
    while (opc!= 0){
    print("digite a opc: ")
    opc = readln().toInt()

    if (opc == 1) {
        print("Base: )
        val B = readln()
        print("Altura: ")
        val H = readln()
        val retangulo = Retangulo(B, H)
        listaRetangulo.add(retangulo)
    }
    if (opc == 2) {
        for (e in listaRetangulo) {
            println("A area do retangulo é de: ${e.calArea()}
        }
    if (opc == 3) {
        for (e in listaRetangulo) {
            println("O perimetro do retangulo é de: ${e.calPer()}
        }
}
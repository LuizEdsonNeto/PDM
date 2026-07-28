fun main(){
    println("Escreva a base do retângulo")
    val b = readln().toInt()
    println("Escreva a altura do retângulo")
    val h = readln().toInt()
    val p = (2*b + 2*h)
    val a = b*h

    println("O perimetro do retângulo é de $p")
    println("A Area do retângulo é de $a")
}

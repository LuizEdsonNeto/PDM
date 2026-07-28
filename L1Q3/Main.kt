fun main(){
    println("Digite a altura da primeira pessoa: ")
    val alt1 = readln().toFloat()
    println("Digite a altura da segunda pessoa: ")
    val alt2 = readln().toFloat()
    println("Digite a altura da terceira pessoa: ")
    val alt3 = readln().toFloat()
    val media = (alt1 + alt2 + alt3)/3
    println("A media das alturas é de: $media")
}
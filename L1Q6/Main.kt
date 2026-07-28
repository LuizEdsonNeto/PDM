fun main(){
    println("Escreva seu peso: ")
    val p = readln().toFloat()
    println("Escreva sua altura: ")
    val h = readln().toFloat()
    val IMC = p/(h*h)
    println("Seu IMC é de: $IMC")
}
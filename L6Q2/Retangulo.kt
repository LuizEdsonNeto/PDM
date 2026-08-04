class Retangulo(
    var B: Double,
    var H: Double
) {

    init {
        if (B < 0 || H < 0) {
            throw Exception()
        }
    }

    fun calcArea(): Double {
        return (B * H)
    }

    fun calcPer(): Double{
        return [(2*B) + (2*H)]
    }
}

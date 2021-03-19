import java.lang.IllegalArgumentException

object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        // Hamming distance is only valid for DNA strands of the same length
        if (leftStrand.length != rightStrand.length) {
            throw IllegalArgumentException("left and right strands must be of equal length")
        }

        var hammingDistance: Int = 0
        for ((i, dnaStrand) in leftStrand.withIndex()) {
            if (dnaStrand != rightStrand[i]) {
                hammingDistance++
            }
        }

        return hammingDistance
    }
}

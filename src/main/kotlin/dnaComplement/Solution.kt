package dnaComplement

val complement = mapOf("A" to "T", "T" to "A", "C" to "G", "G" to "C")


fun makeComplement(dna: String): String {
    return dna.map {
        complement.getOrDefault(it.toString(), "")
    }.joinToString("")
}


fun main() {
    println(makeComplement("ACGCTTAGCG"))
}
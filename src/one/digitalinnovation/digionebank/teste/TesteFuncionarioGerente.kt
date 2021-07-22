package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val carlos = Gerente("Carlos", "156.156.156-56", 10000.00, "senha123")

    println(carlos.toString())

    println(TesteAutenticacaco().autentica(carlos))
}
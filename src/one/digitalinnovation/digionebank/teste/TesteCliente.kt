package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo


fun main() {
    val jose = Cliente("Jose", "123.123.123-04", ClienteTipo.PF, "123456")

    println(jose)

    println(TesteAutenticacaco().autentica(jose))
}

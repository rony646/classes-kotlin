package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digionebank = Banco("DigiOne", 12)

    println(digionebank.info())

    val banco2 = digionebank.copy(nome = "Santander")

    println(banco2.info())
}
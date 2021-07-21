package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val rony = Analista("rony silva", "123.123-96",  3500.00)

    imprimeRelatorio(rony)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())
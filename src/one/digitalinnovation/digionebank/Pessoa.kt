package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Rony"

    var cpf: String = "123.123.123-61"
    private set

    constructor()

    fun pessoaInfo() = "$nome and $cpf"
}

fun main() {
    val rony = Pessoa()

    println(rony.pessoaInfo())
}
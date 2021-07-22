package one.digitalinnovation.digionebank

class Cliente(
        nome: String,
        cpf: String,
        val clienteTipo: ClienteTipo,
        val senha: String
): Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "1234" == senha

    override fun toString() = "nome: $nome\ncpf: $cpf\ntipo do cliente: $clienteTipo"
}
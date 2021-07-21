package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract  class Funcionario(
        nome: String,
        cpf: String,
        val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = " nome: $nome\ncpf: $cpf\nsalario: $salario\nauxilio:${calculoAuxilio()}"
}
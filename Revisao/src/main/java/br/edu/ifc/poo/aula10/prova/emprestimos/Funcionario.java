package br.edu.ifc.poo.aula10.prova.emprestimos;

public class Funcionario extends Pessoa {

    private Double salario;

    public Funcionario(Double salario, String nome, Long cpf) {
        super(nome, cpf);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

}

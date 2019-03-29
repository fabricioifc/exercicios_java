package br.edu.ifc.poo.aula10.prova.emprestimos;

public class ChefeDeDepartamento extends Funcionario {

    private String departamento;

    public ChefeDeDepartamento(String departamento, Double salario, String nome, Long cpf) {
        super(salario, nome, cpf);
        this.departamento = departamento;
    }

}

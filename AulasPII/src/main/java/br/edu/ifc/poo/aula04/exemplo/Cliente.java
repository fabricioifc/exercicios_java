package br.edu.ifc.poo.aula04.exemplo;

import br.edu.ifc.poo.aula04.exemplo.interfaces.DAOGeral;

public class Cliente implements DAOGeral {

    private int codigo;
    private String nome;

    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public void inserir() {
        System.out.println("Inserindo cliente");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo cliente");
    }

    @Override
    public void listar() {
        System.out.println("Listando clientes");
    }

    @Override
    public String toString() {
        return new StringBuffer().append(this.codigo).append(";").append(this.nome).toString();
    }

}

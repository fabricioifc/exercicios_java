package br.edu.ifc.poo.aula09;

public class Proprietario {

    private String nome;
    private String cpf;
    private String rg;

    public Proprietario(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Proprietario{" + "nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + '}';
    }

}

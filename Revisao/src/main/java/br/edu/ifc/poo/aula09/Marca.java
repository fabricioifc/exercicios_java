package br.edu.ifc.poo.aula09;

public class Marca {

    private Integer id;
    private String nome;
    private Integer anoLancamento;

    public Marca() {
    }

    public Marca(Integer id, String nome, Integer anoLancamento) {
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Marca{" + "id=" + id + ", nome=" + nome + ", anoLancamento=" + anoLancamento + '}';
    }

}

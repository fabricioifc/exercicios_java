package br.edu.ifc.poo.aula10.prova;

abstract public class Livro {

    private String titulo;
    private String autor;

    Livro(String t, String a) {
        titulo = t;
        autor = a;
    }

    @Override
    abstract public String toString();
}

class UsarLivro extends Livro {

    public UsarLivro() {
        super("","");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}

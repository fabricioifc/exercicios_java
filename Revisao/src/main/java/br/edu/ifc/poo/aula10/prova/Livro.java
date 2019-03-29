package br.edu.ifc.poo.aula10.prova;

abstract public class Livro {

    abstract private String titulo;
    abstract private String autor;

    Livro(String t, double a) {
        titulo = t;
        autor = a;
    }

    @Override
    abstract public String toString();
}

class UsarLivro extends Livro {

    public UsarLivro() {

    }

}

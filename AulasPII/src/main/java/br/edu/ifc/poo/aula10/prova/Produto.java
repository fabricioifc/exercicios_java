package br.edu.ifc.poo.aula10.prova;

abstract public class Produto {

    private String identificacao;
    private double custoDeFabricacao;

    Produto(String i, double c) {
        identificacao = i;
        custoDeFabricacao = c;
    }

    @Override
    abstract public String toString();

    abstract public 
        void novoCusto(double nc);
}

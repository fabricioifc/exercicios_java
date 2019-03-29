package br.edu.ifc.poo.aula10.prova;

public class Produto {

    private String identificação;
    private double custoDeFabricação;

    Produto(String i, double c) {
        identificação = i;
        custoDeFabricação = c;
    }

    @Override
    abstract public String toString();

    abstract public 
        void novoCusto(double nc);
}

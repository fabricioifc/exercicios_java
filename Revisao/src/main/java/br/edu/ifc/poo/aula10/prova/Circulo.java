package br.edu.ifc.poo.aula10.prova;

public class Circulo extends Dados {

    //Método construtor
    public Circulo(double raio) {
        super(raio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2.0 * Math.PI * raio;
    }

}

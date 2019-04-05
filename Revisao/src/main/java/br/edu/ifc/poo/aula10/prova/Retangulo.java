package br.edu.ifc.poo.aula10.prova;

public class Retangulo extends Dados {

    //Método construtor
    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2.0 * (base + altura);
    }

}

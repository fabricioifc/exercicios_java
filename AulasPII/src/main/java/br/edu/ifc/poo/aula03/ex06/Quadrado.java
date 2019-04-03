package br.edu.ifc.poo.aula03.ex06;

public class Quadrado extends Forma {

  @Override
  protected double getArea(double tamanho) {
    return tamanho * tamanho;
  }

  @Override
  protected double getPerimetro(double tamanho) {
    return tamanho * 4;
  }

}

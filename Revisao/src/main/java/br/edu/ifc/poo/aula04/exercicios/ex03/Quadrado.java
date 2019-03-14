package br.edu.ifc.poo.aula04.exercicios.ex03;

public class Quadrado implements Calculo {

  private int lado;

  public Quadrado(int lado) {
    this.lado = lado;
  }

  @Override
  public int calcularArea() {
    return lado * lado;
  }

}

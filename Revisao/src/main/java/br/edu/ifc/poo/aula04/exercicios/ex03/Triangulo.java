package br.edu.ifc.poo.aula04.exercicios.ex03;

public class Triangulo implements Calculo {

  private int base, altura;

  public Triangulo(int lado, int altura) {
    this.base = lado;
    this.altura = altura;
  }

  @Override
  public int calcularArea() {
    return (base * altura) / 2;
  }

}

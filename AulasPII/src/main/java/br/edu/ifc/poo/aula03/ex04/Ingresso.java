package br.edu.ifc.poo.aula03.ex04;

public class Ingresso {

  protected double valor;

  public Ingresso(double valor) {
    this.valor = valor;
  }

  public void imprimeValor() {
    System.out.println(this.valor);
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

}

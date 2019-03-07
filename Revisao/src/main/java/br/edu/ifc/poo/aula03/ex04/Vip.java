package br.edu.ifc.poo.aula03.ex04;

public class Vip extends Ingresso {

  protected double adicional;

  public Vip(double valor, double adicional) {
    super(valor);
    this.adicional = adicional;
  }

  public double getValorComAdicional() {
    return super.getValor() + this.adicional;
  }
}

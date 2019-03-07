package br.edu.ifc.poo.aula03.ex04;

public class Normal extends Ingresso {

  public Normal(double valor) {
    super(valor);
  }

  public void imprimir() {
    System.out.println("Ingresso Normal " + super.valor);
  }
}

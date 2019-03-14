package br.edu.ifc.poo.aula04.exercicios.ex04;

public class ContaEspecial extends ContaCorrente {

  private final double TAXA = 0.01;

  public ContaEspecial(double saldo) {
    super(saldo);
  }

  @Override
  public void sacar(double valor) {
    this.saldo -= valor;
    this.saldo -= valor * TAXA;

  }

}

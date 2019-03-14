package br.edu.ifc.poo.aula04.exercicios.ex04;

public class ContaCorrente implements Conta {

  protected double saldo;
  private final double TAXA = 0.05;

  public ContaCorrente(double saldo) {
    this.saldo = saldo;
  }

  @Override
  public void depositar(double valor) {
    this.saldo += valor;
  }

  @Override
  public void sacar(double valor) {
    this.saldo -= valor;
    this.saldo -= valor * TAXA;
  }

  @Override
  public double obterSaldo() {
    return saldo;
  }

}

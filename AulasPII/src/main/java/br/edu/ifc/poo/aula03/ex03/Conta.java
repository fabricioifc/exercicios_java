package br.edu.ifc.poo.aula03.ex03;

public abstract class Conta {

  private Integer numeroConta;
  private String agencia;
  protected Double saldo;

  public Conta() {
    this.saldo = 0.0;
  }

  public Conta(Integer numeroConta, String agencia) {
    this.numeroConta = numeroConta;
    this.agencia = agencia;
    this.saldo = 0.0;
  }

  public Conta(Integer numeroConta, String agencia, Double saldo) {
    this.numeroConta = numeroConta;
    this.agencia = agencia;
    this.saldo = saldo;
  }

  public void depositar(Double valor) {
    if (valor > 0.0) {
      this.saldo += valor;
    }
  }

  public abstract void atualizarSaldo(Double taxa);

  public void sacar(Double valor) {
    this.saldo -= valor;
  }

  public Integer getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(Integer numeroConta) {
    this.numeroConta = numeroConta;
  }

  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("%-15s %-15s %-30s\n", "Número", "Agência", "Saldo"));
    sb.append(String.format("%-15s %-15s %-30s\n", this.numeroConta, this.agencia, this.saldo));

    return sb.toString();
  }

}

package br.edu.ifc.poo.aula01;

public class Conta {

  private String cliente;
  private double saldo;

  private static final int SALDO_MINIMO = 50;

  private boolean verificarSaldo(double valor) {
    return this.saldo - valor >= SALDO_MINIMO;
  }

  public void exibeSaldo() {
    System.out.println("Saldo: " + saldo);
  }

  public void saca(double valor) {
    if (verificarSaldo(valor)) {
      this.saldo -= valor;
      System.out.println("Sacou " + valor);
    } else {
      System.out.println("Saldo Insuficiente!");
    }

  }

  public void deposita(double valor) {
    this.saldo += valor;
    System.out.println("Depositou " + valor);
  }

  public void transferePara(Conta destino, double valor) {
    if (verificarSaldo(valor)) {
      destino.setSaldo(destino.getSaldo() + valor);
      System.out.println("Transferência do cliente "
          + this.getCliente()
          + " para o cliente "
          + destino.getCliente()
          + " o valor de " + valor);
    } else {
      System.out.println("Saldo Insuficiente!");
    }
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

}

package br.edu.ifc.poo.aula01;

public class Conta {

  private String cliente;
  private double saldo;

  // Saldo não pode ficar abaixo disso
  private static final int SALDO_MINIMO = 50;

  /**
   * Verificar o saldo após efetuar alguma operação.
   *
   * @param valor
   * @return
   */
  private boolean verificarSaldo(double valor) {
    return this.saldo - valor >= SALDO_MINIMO;
  }

  /**
   * Mostra o saldo
   */
  public void exibeSaldo() {
    System.out.println("Saldo: " + this.saldo);
  }

  /**
   * Retira valor da conta, se o saldo não ficar abaixo do saldo mínimo
   *
   * @see Conta#SALDO_MINIMO
   * @param valor
   */
  public void saca(double valor) {
    if (verificarSaldo(valor)) {
      this.corrigirSaldo(valor, false);
      System.out.println("Sacou " + valor);
    } else {
      System.out.println("Saldo Insuficiente!");
    }

  }

  /**
   * Deposita na conta
   *
   * @param valor valor a ser depositado
   */
  public void deposita(double valor) {
    this.corrigirSaldo(valor, true);
    System.out.println("Depositou " + valor);
  }

  /**
   * Transfere desta conta para outra conta
   *
   * @see Conta#SALDO_MINIMO não pode ficar abaixo disso
   * @param destino
   * @param valor
   */
  public void transferePara(Conta destino, double valor) {
    if (verificarSaldo(valor)) {
      destino.setSaldo(destino.getSaldo() + valor);
      corrigirSaldo(valor, false);
      System.out.println("Transferência do cliente "
          + this.getCliente()
          + " para o cliente "
          + destino.getCliente()
          + " o valor de " + valor);
    } else {
      System.out.println("Saldo Insuficiente!");
    }
  }

  /**
   * Método padrão para aumentar/diminuir o valor do saldo desta conta
   *
   * @param valor
   * @param aumentar
   */
  private void corrigirSaldo(double valor, boolean aumentar) {
    if (aumentar) {
      this.saldo += valor;
//      this.saldo += 10;
    } else {
      this.saldo -= valor;
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

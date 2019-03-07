package br.edu.ifc.poo.aula03.ex03;

/**
 *
 * @author fabricio
 */
public class ContaPoupanca extends Conta {

  public ContaPoupanca(Integer numeroConta, 
      String agencia) {
    super(numeroConta, agencia);
  }

  @Override
  public void atualizarSaldo(Double taxa) {
    this.setSaldo(this.saldo + (this.saldo * taxa) / 100);
  }

}

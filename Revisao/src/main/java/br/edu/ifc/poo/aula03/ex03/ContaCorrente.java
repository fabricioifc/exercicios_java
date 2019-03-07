package br.edu.ifc.poo.aula03.ex03;

/**
 *
 * @author fabricio
 */
public class ContaCorrente extends Conta {

  public ContaCorrente(Integer numero, 
      String agencia, Double saldo) {
    super(numero, agencia, saldo);
  }

  @Override
  public void atualizarSaldo(Double taxa) {
    System.out.println("Não tem Reajuste nesta conta " + super.getNumeroConta());
  }

}

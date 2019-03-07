package br.edu.ifc.poo.aula03.ex05;

/**
 *
 * @author fabricio
 */
public class Velho extends Imovel {

  private Double desconto;

  @Override
  public void imprimirValor() {
    System.out.println(this.desconto);
  }

  public Double getDesconto() {
    return desconto;
  }

  public void setDesconto(Double desconto) {
    this.desconto = desconto;
  }

}

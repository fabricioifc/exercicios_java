package br.edu.ifc.poo.aula03.ex05;

/**
 *
 * @author fabricio
 */
public class Novo extends Imovel {

  private Double adicional;

  @Override
  public void imprimirValor() {
    System.out.println(this.adicional);
  }

  public Double getAdicional() {
    return adicional;
  }

  public void setAdicional(Double adicional) {
    this.adicional = adicional;
  }

}

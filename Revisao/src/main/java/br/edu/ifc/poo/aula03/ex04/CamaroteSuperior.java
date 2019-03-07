package br.edu.ifc.poo.aula03.ex04;

public class CamaroteSuperior
    extends Vip {

  public CamaroteSuperior(double valor, double adicional) {
    super(valor, adicional);
  }

  @Override
  public double getValorComAdicional() {
    return super.valor + this.adicional;
  }
}

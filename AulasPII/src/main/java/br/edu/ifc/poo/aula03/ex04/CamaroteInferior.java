package br.edu.ifc.poo.aula03.ex04;

public class CamaroteInferior
    extends Vip {

  private String localizacao;

  public CamaroteInferior(double valor, double adicional) {
    super(valor, adicional);
  }

  public void imprimir() {
    System.out.println(this.localizacao);
  }

  public String getLocalizacao() {
    return localizacao;
  }

  public void setLocalizacao(String localizacao) {
    this.localizacao = localizacao;
  }

}

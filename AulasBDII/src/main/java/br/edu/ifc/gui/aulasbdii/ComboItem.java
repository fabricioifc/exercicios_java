package br.edu.ifc.gui.aulasbdii;

public class ComboItem {

  private String valor;
  private String texto;

  public ComboItem(String valor, String texto) {
    this.valor = valor;
    this.texto = texto;
  }

  @Override
  public String toString() {
    return texto;
  }

}

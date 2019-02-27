package br.edu.ifc.aula.ufc;

public enum CategoriaType {

  LEVE("Peso Leve"),
  PENA("Peso Pena"),
  PESADO("Peso Pesado"),
  MOSCA("Peso Mosca"),
  MEDIO("Peso Médio");

  private final String tipo;

  private CategoriaType(String tipo) {
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

}

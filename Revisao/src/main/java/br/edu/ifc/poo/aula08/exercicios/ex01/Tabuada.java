package br.edu.ifc.poo.aula08.exercicios.ex01;

public class Tabuada {

  private Integer numero;

  public Tabuada(Integer numero) {
    this.numero = numero;
  }

  public String gerarTabuada() {
    StringBuilder sb = new StringBuilder("Tabuada do número ").append(numero).append("\n\n");
    for (int i = 0; i < 10; i++) {
      sb.append(this.numero).append(" x ").append(i);
      sb.append(" = ");
      sb.append(this.numero * i).append("\n");
    }

    return sb.toString();
  }

}

package br.edu.ifc.sabado01.ex01;

import javax.swing.JOptionPane;

public class Semana {

  private int[] dias;
  private String[] diasTexto;

  public Semana() {
    this.dias = new int[]{1, 2, 3, 4, 5, 6, 7};
    this.diasTexto = new String[]{"Domingo", "Segunda", "Terça",
      "Quarta", "Quinta", "Sexta", "Sábado"};
  }

  public Semana(int[] dias, String[] diasTexto) {
    this.dias = dias;
    this.diasTexto = diasTexto;
  }

  public String verificarDia(int dia) {
    if (dia >= 1 && dia <= 7) {
      return diasTexto[dia - 1];
    }

    return "Dia Inválido!";
  }

  public int[] getDias() {
    return dias;
  }

  public void setDias(int[] dias) {
    this.dias = dias;
  }

  public String[] getDiasTexto() {
    return diasTexto;
  }

  public void setDiasTexto(String[] diasTexto) {
    this.diasTexto = diasTexto;
  }

}

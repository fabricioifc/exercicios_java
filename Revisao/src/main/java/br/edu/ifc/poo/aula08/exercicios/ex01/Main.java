package br.edu.ifc.poo.aula08.exercicios.ex01;

import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {
    try {
      Integer numero = Integer.parseInt(
          JOptionPane.showInputDialog("Informe um número: ")
      );

      Tabuada t = new Tabuada(numero);
      JOptionPane.showMessageDialog(null, t.gerarTabuada());
    } catch (NumberFormatException ex) {
      ex.printStackTrace();
      JOptionPane.showMessageDialog(null, "Informe um número!");
    }
  }
}

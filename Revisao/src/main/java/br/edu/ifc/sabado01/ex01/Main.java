package br.edu.ifc.sabado01.ex01;

import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {
    try {
      Semana teste = new Semana();

      String entrada = JOptionPane.showInputDialog("Informe o dia: ");
      int dia = Integer.parseInt(entrada);

      String resposta = teste.verificarDia(dia);
      JOptionPane.showMessageDialog(null, resposta);
    } catch (NumberFormatException erro) {
      erro.printStackTrace();
      JOptionPane.showMessageDialog(null, "Informe um número!");
    }
  }
}

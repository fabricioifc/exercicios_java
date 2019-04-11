package br.edu.ifc.gui.aula11.ex01;

import br.edu.ifc.PrimeiraInteface;

public class Main {

  public static void main(String[] args) {
    Runnable rodar = new Runnable() {
      @Override
      public void run() {
        LoginFrame tela = new LoginFrame();
        tela.setVisible(true);
      }
    };
    java.awt.EventQueue.invokeLater(rodar);

  }
}

package br.edu.ifc.projeto.sistema;

public class Main {

  public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        PrincipalUtil.getInstance().iniciarSistema();
      }
    });

  }

}

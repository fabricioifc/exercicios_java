package br.edu.ifc.gui.aula18.sistema;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PrincipalUtil.getInstance().iniciarSistema();
            }
        });

    }

}

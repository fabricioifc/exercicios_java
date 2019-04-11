package br.edu.ifc.gui.aula13.calculadora;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        CalculadoraFacilGUI frame = new CalculadoraFacilGUI();

        Dimension tamanhoDaTela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tamanhoDaTela.width - frame.getSize().width) / 2, (tamanhoDaTela.height - frame.getSize().height) / 2);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
    });

  }
}

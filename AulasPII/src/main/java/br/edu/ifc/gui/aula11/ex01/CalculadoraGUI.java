package br.edu.ifc.gui.aula11.ex01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CalculadoraGUI extends JFrame {

  public CalculadoraGUI() {
    super("Calculadora GUI");
    super.setSize(300, 300);

    Container painel = new JPanel();
    painel.setLayout(new GridLayout(4, 4, 2, 2));
    painel.add(new JButton("7"));
    painel.add(new JButton("8"));
    painel.add(new JButton("9"));
    painel.add(new JButton("/"));

    painel.add(new JButton("4"));
    painel.add(new JButton("5"));
    painel.add(new JButton("6"));
    painel.add(new JButton("*"));

    painel.add(new JButton("1"));
    painel.add(new JButton("2"));
    painel.add(new JButton("3"));
    painel.add(new JButton("-"));

    painel.add(new JButton("0"));
    painel.add(new JButton("."));
    painel.add(new JButton("="));
    painel.add(new JButton("+"));

    JTextField texto = new JTextField();
    texto.setFont(new Font("serif", Font.PLAIN, 25));
    texto.setEnabled(false);

    Container container = super.getContentPane();
    container.setLayout(new BorderLayout());
    container.add(BorderLayout.NORTH, texto);
    container.add(BorderLayout.CENTER, painel);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        CalculadoraGUI frame = new CalculadoraGUI();

        Dimension tamanhoDaTela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tamanhoDaTela.width - frame.getSize().width) / 2, (tamanhoDaTela.height - frame.getSize().height) / 2);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
    });

  }

}

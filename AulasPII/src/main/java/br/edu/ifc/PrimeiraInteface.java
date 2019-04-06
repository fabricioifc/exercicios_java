package br.edu.ifc;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;

public class PrimeiraInteface extends JFrame {

  private JButton btnSalvar;

  public PrimeiraInteface() {
    super("Primeiro Exemplo");
    super.setSize(300, 200);
    super.setVisible(false);
    super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    Container c1 = super.getContentPane();
    c1.setLayout(new BorderLayout());
    c1.add(BorderLayout.CENTER, new JButton("Centro"));
    c1.add(BorderLayout.EAST, new JButton("Leste"));
    c1.add(BorderLayout.WEST, new JButton("Oeste"));
    c1.add(BorderLayout.NORTH, new JButton("Norte"));
    c1.add(BorderLayout.SOUTH, new JButton("Sul"));

    // JPanel com GridLayout
    Container c2 = new JPanel();
    c2.setLayout(new GridLayout(4, 1));
    c2.add(new JButton("Salvar"));
    c2.add(new JButton("Cancelar"));
    c2.add(new JButton("Abrir"));
    c2.add(new JButton("Ajuda"));

    c1.add(BorderLayout.EAST, c2);
  }

}

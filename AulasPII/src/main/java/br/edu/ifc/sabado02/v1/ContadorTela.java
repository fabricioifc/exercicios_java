package br.edu.ifc.sabado02.v1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ContadorTela extends JFrame implements ActionListener {

  private JLabel lblContador;
  private JTextField txtContador;
  private JButton btnIncrementar, btnDecrementar;

  private int contador = 0;

  public ContadorTela() {
    super("Contador");
    super.setLayout(new FlowLayout());
    super.setSize(450, 70);
    super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    initComponentes();
  }

  private void initComponentes() {
    // Cria os componentes
    lblContador = new JLabel("Contador");
    txtContador = new JTextField(contador + "", 10);
    txtContador.setEditable(false);
    btnIncrementar = new JButton("Incrementar");
    btnDecrementar = new JButton("Decrementar");

    // Adiciona os componentes na tela
    super.getContentPane().add(lblContador);
    super.getContentPane().add(txtContador);
    super.getContentPane().add(btnIncrementar);
    super.getContentPane().add(btnDecrementar);

    btnIncrementar.addActionListener(this);
    btnDecrementar.addActionListener(this);

    verificarBotao();
    lblContador.setForeground(Color.red);
    lblContador.setFont(new Font("Courier", Font.BOLD, 14));
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println(e.getActionCommand());

    if (e.getActionCommand().equals("Incrementar")) {
      contador = contador + 1;
    } else {
      contador = contador - 1;
    }
    verificarBotao();
    txtContador.setText(String.valueOf(contador));
  }

  private void verificarBotao() {
    btnDecrementar.setEnabled(contador > 0);
  }

  public static void main(String[] args) {
    ContadorTela app = new ContadorTela();
    app.setVisible(true);
  }

}

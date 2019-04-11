package br.edu.ifc.gui.aula13.calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraFacil02GUI extends JFrame implements ActionListener {

  private JTextField txtResultado;
  private boolean novo = true;
  private final String[] teclas = new String[]{
    "7", "8", "9", "/",
    "4", "5", "6", "*",
    "1", "2", "3", "-",
    "0", ".", "=", "+"
  };

  private String valorAtual = "";
  private String valorAnterior = "";
  private String operador;
  private boolean operadorClicado;

  public CalculadoraFacil02GUI() {
    super("Calculadora GUI");
    super.setSize(300, 300);

    Container painel = new JPanel();
    painel.setLayout(new GridLayout(4, 4, 2, 2));

    txtResultado = new JTextField();
    txtResultado.setFont(new Font("Arial", Font.PLAIN, 22));
    txtResultado.setEnabled(false);

    Container container = super.getContentPane();
    container.setLayout(new BorderLayout());
    container.add(BorderLayout.NORTH, txtResultado);
    container.add(BorderLayout.CENTER, painel);

    painel.add(criarBotao("7"));
    painel.add(criarBotao("8"));
    painel.add(criarBotao("9"));
    painel.add(criarBotao("/"));

  }

  private JButton criarBotao(String texto) {
    JButton botao = new JButton(texto);
    botao.addActionListener(this);
    return botao;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String entrada = e.getActionCommand();

    txtResultado.setText(this.txtResultado.getText() + entrada);
  }

//  private JButton criarBotao(String texto) {
//    JButton botao = new JButton(texto);
//
//    Action acao = new AbstractAction(texto) {
//      @Override
//      public void actionPerformed(ActionEvent e) {
//        CalculadoraFacil02GUI.this.actionPerformed(e);
//      }
//    };
//    botao.addActionListener(acao);
//
//    return botao;
//  }
//
//  @Override
//  public void actionPerformed(ActionEvent e) {
//  }
}

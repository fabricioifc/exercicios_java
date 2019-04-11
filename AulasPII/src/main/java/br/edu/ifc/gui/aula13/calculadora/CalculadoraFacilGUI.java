package br.edu.ifc.gui.aula13.calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraFacilGUI extends JFrame implements ActionListener {

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

  public CalculadoraFacilGUI() {
    super("Calculadora GUI");
    super.setSize(300, 300);

    Container painel = new JPanel();
    painel.setLayout(new GridLayout(4, 4, 2, 2));

    txtResultado = new JTextField();
    txtResultado.setFont(new Font("Arial", Font.PLAIN, 22));
    txtResultado.setEnabled(false);

    for (int i = 0; i < teclas.length; i++) {
      painel.add(criarBotao(teclas[i]));
    }

    Container container = super.getContentPane();
    container.setLayout(new BorderLayout());
    container.add(BorderLayout.NORTH, txtResultado);
    container.add(BorderLayout.CENTER, painel);
    container.add(BorderLayout.SOUTH, criarBotao("Limpar"));
  }

  private JButton criarBotao(String texto) {
    JButton botao = new JButton(texto);

    Action acao = new AbstractAction(texto) {
      @Override
      public void actionPerformed(ActionEvent e) {
//        System.out.println(e.getActionCommand());
        CalculadoraFacilGUI.this.actionPerformed(e);
      }
    };
    botao.addActionListener(acao);
    botao.addKeyListener(new KeyAdapter() {

      @Override
      public void keyPressed(KeyEvent e) {
        acao.actionPerformed(new ActionEvent(e.getSource(), e.getKeyCode(), String.valueOf(e.getKeyChar())));
      }
    });

    return botao;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String entrada = e.getActionCommand();
    if (Arrays.asList(teclas).contains(entrada)) {
      System.out.println(e.getActionCommand());

      if (this.operadorClicado) {
        this.operadorClicado = false;
        this.valorAnterior = txtResultado.getText();
        setResultado("");
      }

      if (isNumero(entrada)) {

        this.valorAtual = this.txtResultado.getText() + entrada;
        setResultado(this.valorAtual);

      } else if (isOperador(entrada)) {
        this.operador = entrada;
      } else if (podeCalcular(entrada)) {
        String resultado = calcular(valorAnterior, valorAtual, operador);
        txtResultado.setText(resultado);
      }

    } else if ("Limpar".equals(entrada)) {
      limpar();
      setResultado("");
    }
  }

  private boolean isOperador(String entrada) {
    operadorClicado = true;
    return Arrays.asList(new String[]{"+", "-", "*", "/"}).contains(entrada);
  }

  private boolean isNumero(String entrada) {
    return Arrays.asList(new String[]{
      "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"
    }).contains(entrada);
  }

  private String calcular(String valorAnterior, String valorAtual, String operador) {
    Double v1 = Double.parseDouble(valorAnterior);
    Double v2 = Double.parseDouble(valorAtual);
    Double resultado = null;
    switch (operador) {
      case "+":
        resultado = v1 + v2;
        break;
      case "-":
        resultado = v1 - v2;
        break;
      case "*":
        resultado = v1 * v2;
        break;
      case "/":
        resultado = v1 / v2;
        break;
    }
    limpar();
    return resultado.toString();
  }

  private void setResultado(String entrada) {
    txtResultado.setText(entrada);
  }

  private boolean podeCalcular(String entrada) {
    if (entrada.equals("=")) {
      return !this.valorAnterior.equals("") && !this.valorAtual.equals("") && !this.operador.equals("");
    }
    return false;

  }

  private void limpar() {
    this.valorAnterior = "";
    this.valorAtual = "";
    this.operador = "";
    this.operadorClicado = false;
  }
}

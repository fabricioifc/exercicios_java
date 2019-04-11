package br.edu.ifc.gui.aula13.calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CalculadoraGUI extends JFrame implements ActionListener {

  private JTextField txtResultado;
  private boolean novo = true;
  private final String[] teclas = new String[]{"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};

  public CalculadoraGUI() {
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
  }

  private JButton criarBotao(String texto) {
    JButton botao = new JButton(texto);

    Action acao = new AbstractAction(texto) {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        CalculadoraGUI.this.actionPerformed(e);
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
    if (novo || e.getID() == KeyEvent.VK_ESCAPE) {
      txtResultado.setText("");
      novo = false;
    }
    String resultado = txtResultado.getText();
    String texto = e.getActionCommand();
    String ultimaLetra = resultado.length() == 0 ? null : String.valueOf(resultado.charAt(resultado.length() - 1));

    System.out.println(texto + " - " + ultimaLetra);

    if (!verificarTecla(texto) && !isEnter(e.getID())) {
      return;
    }

    if (ultimaLetra == null && !isNumero(texto)) {
      return;
    }

    if (isIgual(texto) || isEnter(e.getID())) {
      if (isNumero(ultimaLetra)) {
        // aqui vai calcular
        calcular();
      }
    } else {
      System.out.println(isNumero(texto));
      if ((ultimaLetra != null && !isNumero(ultimaLetra) && !isPonto(ultimaLetra)) || (!isNumero(texto) && !isPonto(texto))) {
        resultado = resultado += " " + texto;
      } else {
        resultado = resultado += texto;
      }
      txtResultado.setText(resultado);
    }
  }

  private boolean isNumero(String texto) {
    return texto.matches("[0-9]+");
  }

  private boolean isIgual(String caracter) {
    return "=".equals(caracter);

  }

  private boolean isPonto(String caracter) {
    return ".".equals(caracter);
  }

  private void calcular() {
    String texto = txtResultado.getText();

    try {
      ScriptEngineManager engineManager = new ScriptEngineManager();
      ScriptEngine engine = engineManager.getEngineByName("JavaScript");
      String resultado = String.valueOf(engine.eval(texto));

      txtResultado.setText(resultado);

      novo = true;
    } catch (ScriptException ex) {
      JOptionPane.showMessageDialog(null, "Erro ao calcular!");
      txtResultado.setText("");
      ex.printStackTrace();
    }

  }

  /**
   * Teclas permitidas
   *
   * @param texto
   * @return
   */
  private boolean verificarTecla(String texto) {
    boolean permitida = Arrays.stream(teclas).anyMatch(texto::equals);
    return permitida;
  }

  private boolean isEnter(int id) {
    return KeyEvent.VK_ENTER == id;
  }

}

package br.edu.ifc.gui.aula14.exemplos;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFrame extends JFrame implements ItemListener {

  private JTextField textField;
  private JCheckBox boldCheckBox;
  private JCheckBox italicCheckBox;
  private JCheckBox caixaAltaCheckBox;
  private JCheckBox caixaBaixaCheckBox;
  private ButtonGroup grupo;

  public CheckBoxFrame() {
    super("Testes com checkbox");
    setLayout(new FlowLayout());

    textField = new JTextField("Veja a fonte sendo alterada", 20);
    textField.setFont(new Font("Serif", Font.PLAIN, 14));
    this.add(textField);

    boldCheckBox = new JCheckBox("Negrito");
    italicCheckBox = new JCheckBox("Italico");
    add(boldCheckBox);
    add(italicCheckBox);

    // Adiciona listener aos checkbox
    boldCheckBox.addItemListener(this);
    italicCheckBox.addItemListener(this);

    caixaAltaCheckBox = new JCheckBox("UpperCase");
    caixaBaixaCheckBox = new JCheckBox("LowerCase");
    
    grupo = new ButtonGroup();
    grupo.add(caixaAltaCheckBox);
    grupo.add(caixaBaixaCheckBox);
    
    add(caixaAltaCheckBox);
    add(caixaBaixaCheckBox);

    caixaAltaCheckBox.addItemListener(this);
    caixaBaixaCheckBox.addItemListener(this);

  }

  @Override
  public void itemStateChanged(ItemEvent e) {

    Font fonte = null;

    if (boldCheckBox.isSelected() && italicCheckBox.isSelected()) {
      fonte = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
    } else if (boldCheckBox.isSelected()) {
      fonte = new Font("Serif", Font.BOLD, 14);
    } else if (italicCheckBox.isSelected()) {
      fonte = new Font("Serif", Font.ITALIC, 14);
    } else {
      fonte = new Font("Serif", Font.PLAIN, 14);
    }

    if (caixaAltaCheckBox.isSelected()) {
      String texto = textField.getText();
      textField.setText(texto.toUpperCase());
    } else if (caixaBaixaCheckBox.isSelected()) {
      String texto = textField.getText();
      textField.setText(texto.toLowerCase());
    }

    textField.setFont(fonte);
  }

  public static void main(String[] args) {
    CheckBoxFrame frame = new CheckBoxFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(275, 100);
    frame.setVisible(true);
  }

//  private ItemListener criarEventoUpperLower(boolean caixaAlta) {
//    ItemListener acao = new ItemListener() {
//      @Override
//      public void itemStateChanged(ItemEvent e) {
//
//      }
//    }
//  }
}

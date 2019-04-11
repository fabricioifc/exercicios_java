package br.edu.ifc.gui.aula14.exemplos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame implements ActionListener {

  private JButton btnTexto;
  private JButton btnIcone;
  private JButton btnSalvar;

  public ButtonFrame() {
    super("Testando Botões");
    setLayout(new FlowLayout());

    btnTexto = new JButton("Clique Aqui");
    add(btnTexto);

    Icon icon1 = new ImageIcon("src/main/resources/br/edu/ifc/gui/images/button1.png");
    Icon icon2 = new ImageIcon("src/main/resources/br/edu/ifc/gui/images/button2.png");
    btnIcone = new JButton("Com Ícone", icon1);
    btnIcone.setRolloverIcon(icon2);
    add(btnIcone);

    btnSalvar = new JButton("Salvar");
    getContentPane().add(btnSalvar);

    btnIcone.addActionListener(this);
    btnTexto.addActionListener(this);
    btnSalvar.addActionListener(new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(ButtonFrame.this, "Salvo com Sucesso!");
      }
    });
  }

  /**
   * Evento será capturado ao teclar entre dentro do campo
   *
   * @param e
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(ButtonFrame.this, String.format("Você clicou: %s", e.getActionCommand()));

  }

  public static void main(String[] args) {
    ButtonFrame frame = new ButtonFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 100);
    frame.setVisible(true);
    frame.setFocusable(true);
  }

}

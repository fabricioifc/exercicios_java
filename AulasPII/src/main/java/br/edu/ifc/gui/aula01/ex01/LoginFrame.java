package br.edu.ifc.gui.aula01.ex01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class LoginFrame extends JFrame {

  private JTextField txtLogin;
  private JLabel lblSenha;
  private JLabel lblLogin;
  private JButton btnLogar;
  private JButton btnCancelar;
  private JPasswordField txtSenha;

  public LoginFrame() {
    initComponentes();
    initEventos();
  }

  private void initComponentes() {
    super.setTitle("Login");
    super.setBounds(0, 0, 250, 200);
    super.setLayout(null);

    lblLogin = new JLabel("Login: ");
    lblSenha = new JLabel("Senha: ");

    txtLogin = new JTextField();
    txtSenha = new JPasswordField();

    btnLogar = new JButton(UIManager.getIcon(
        "FileView.floppyDriveIcon"
    ));
    btnLogar.setText("Logar");

    btnCancelar = new JButton("Cancelar");

    // Posicionando Elementos
    lblLogin.setBounds(30, 30, 80, 25);
    lblSenha.setBounds(30, 75, 80, 25);

    txtLogin.setBounds(100, 30, 120, 25);
    txtSenha.setBounds(100, 75, 120, 25);

    btnLogar.setBounds(20, 120, 100, 25);
    btnCancelar.setBounds(125, 120, 100, 25);

    super.getContentPane().add(lblLogin);
    super.getContentPane().add(lblSenha);
    super.getContentPane().add(txtLogin);
    super.getContentPane().add(txtSenha);
    super.getContentPane().add(btnLogar);
    super.getContentPane().add(btnCancelar);

  }

  private void initEventos() {
    ActionListener ouvindoBotaoLogar = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String textoLogin = txtLogin.getText().toLowerCase();
        String textoSenha = String.valueOf(txtSenha.getPassword());

        if (textoLogin.equals("aluno")
            && textoSenha.equals("ifcfraiburgo")) {
          JOptionPane.showMessageDialog(null, "Logado com Sucesso!");
        } else {
          JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválido!");
        }
      }
    };

    btnLogar.addActionListener(ouvindoBotaoLogar);

    btnCancelar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });

  }

}

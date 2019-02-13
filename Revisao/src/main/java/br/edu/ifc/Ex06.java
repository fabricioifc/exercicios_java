package br.edu.ifc.revisoes.inicio;

import java.math.BigInteger;
import java.security.MessageDigest;
import javax.swing.JOptionPane;

public class Ex06 {

  public static void main(String[] args) {
    try {
      String loginValido = "aluno";
      String senhaValida = criptografar("ifcfraiburgo");

      String login = JOptionPane.showInputDialog("Login: ");
      String senha = JOptionPane.showInputDialog("Senha: ");

      if (login.equals(loginValido)
          && senhaValida.equals(criptografar(senha))) {
        JOptionPane.showMessageDialog(null, "Bem vindo!");
      } else {
        JOptionPane.showMessageDialog(null, "Login inválido!");
      }

    } catch (Exception ex) {
      ex.printStackTrace();
    }

  }

  public static String criptografar(String senha) throws Exception {
    MessageDigest md = MessageDigest.getInstance("MD5");
    md.update(senha.getBytes(), 0, senha.length());
    String resultado = new BigInteger(1, md.digest()).toString(16);
    return resultado;
  }

}

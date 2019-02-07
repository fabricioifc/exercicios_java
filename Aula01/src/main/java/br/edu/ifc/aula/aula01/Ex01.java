package br.edu.ifc.aula.aula01;

import java.awt.TrayIcon;
import javax.swing.JOptionPane;

public class Ex01 {

  public static void main(String[] args) {
    String nome;
    double n1, n2, n3, media;
    int p1, p2, p3;

    try {
      nome = JOptionPane.showInputDialog("Informe seu nome: ");
      n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota: "));
      p1 = Integer.parseInt(JOptionPane.showInputDialog("Peso 1"));
      n2 = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota: "));
      p2 = Integer.parseInt(JOptionPane.showInputDialog("Peso 2"));
      n3 = Double.parseDouble(JOptionPane.showInputDialog("Terceira nota: "));
      p3 = Integer.parseInt(JOptionPane.showInputDialog("Peso 3"));

      int somaPesos = p1 + p2 + p3;

      if (somaPesos == 10) {
        media = (n1 * p1) + (n2 * p2) + (n3 * p3) / somaPesos;

        JOptionPane.showMessageDialog(null,
            "A média do aluno " + nome + " é: " + media);

        if (media >= 7) {
          JOptionPane.showMessageDialog(null, "Aprovado");
        } else if (media > 4 && media < 7) {
          JOptionPane.showMessageDialog(null, "Exame");
        } else {
          JOptionPane.showMessageDialog(null, "Reprovado");
        }
      } else {
        JOptionPane.showMessageDialog(null, "A soma dos pesos deve ser dez!");
      }

    } catch (NumberFormatException ex) {
      JOptionPane.showMessageDialog(null,
          "Houve um erro na conversão dos números!", "Informe números válidos!",
          TrayIcon.MessageType.NONE.ordinal());
      ex.printStackTrace();
    } finally {
      System.out.println("Saindo...");
      System.exit(0);
    }
  }

}

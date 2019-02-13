package br.edu.ifc.revisoes.inicio;

import javax.swing.JOptionPane;

public class Ex04 {

  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Informe seu nome: ");
    Double peso = Double.parseDouble(
        JOptionPane.showInputDialog("Informe seu peso: ")
    );
    Double altura = Double.parseDouble(
        JOptionPane.showInputDialog("Informe seu altura: ")
    );

//    Double imc = peso / (altura * altura);
    Double imc = calcularImc(peso, altura);

    JOptionPane.showMessageDialog(null,
        "Nome: " + nome + "\n"
        + "IMC: " + imc + "\n"
        + "Resultado: " + verificarTipo(imc));
  }

  public static double calcularImc(double peso, double altura) {
    return peso / (altura * altura);
  }

  public static String verificarTipo(double imc) {
    String resultado = null;
    if (imc < 18.5) {
      resultado = "Peso abaixo do normal";
    } else if (imc >= 18.6 && imc <= 24.4) {
      resultado = "Peso Ideal";
    } else if (imc >= 24.5 && imc <= 29.9) {
      resultado = "Pré-obesidade";
    } else if (imc >= 30 && imc <= 34.9) {
      resultado = "Obesidade classe I";
    } else if (imc >= 35 && imc <= 39.9) {
      resultado = "Obesidade classe II (severa)";
    } else if (imc >= 40) {
      resultado = "Obesidade classe III (mórbida)";
    }

    return resultado;
  }

}

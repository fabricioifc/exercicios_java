package br.edu.ifc.revisoes.metodos;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Metodos {

  public static void main(String[] args) {
    Metodos m = new Metodos();
    m.imprimirAlgo();

    System.out.println(Metodos.somar(10, 10));
    JOptionPane.showMessageDialog(null, Metodos.somar(1.0, 2D));
    JOptionPane.showMessageDialog(null, Metodos.somar(1, 2));

    String pares = Arrays.toString(m.getPares(3D, 5D, 6D, 7.7, 8.2));
    JOptionPane.showMessageDialog(null, pares);

    JOptionPane.showMessageDialog(null, Metodos.contarLetraA("A POO é um paradigma de programação!"));

  }

  private void imprimirAlgo() {
    System.out.println("Olá Mundo!");
  }

  private static double somar(double n1, double n2) {
    return n1 + n2;
  }

  private static double somar(int n1, int n2) {
    return somar((double) n1, (double) n2);
  }

  private double[] getPares(double... numeros) {
    double pares[] = new double[numeros.length];
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] % 2 == 0) {
        pares[i] = numeros[i];
      }
    }
    return pares;
  }

  private static int contarLetraA(String texto) {
    int contador = 0;

    texto = texto.toUpperCase();
    for (int i = 0; i < texto.length(); i++) {
      contador += texto.charAt(i) == 'A' ? 1 : 0;
    }

    return contador;

  }

}

package br.edu.ifc.aula.aula01.metodos;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ex08 {

  public static void main(String[] args) {
    int[] numeros = {1, 2, 4, 3, 6};

    JOptionPane.showMessageDialog(null, new Ex08().somar(numeros));
    JOptionPane.showMessageDialog(null, new Ex08().maior(numeros));
    JOptionPane.showMessageDialog(null, new Ex08().menor(numeros));
  }

  public int somar(int[] numeros) {
    return Arrays.stream(numeros).sum();
  }

  public int maior(int[] numeros) {
    Arrays.sort(numeros);
    return numeros[0];
  }

  public int menor(int[] numeros) {
    Arrays.sort(numeros);
    return numeros[numeros.length - 1];
  }
}

package br.edu.ifc.aula.aula01.arrays;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Crie um array bidimensional de números inteiros e: imprima a soma de todos os
 * elementos do array.
 *
 * @author fabricio
 */
public class Ex02 {

  public static void main(String[] args) {
    // duas linhas e três colunas
    int numeros[][] = new int[2][3];

    // populando o array com números randômicos
    for (int l = 0; l < numeros.length; l++) {
      for (int c = 0; c < numeros[l].length; c++) {
        numeros[l][c] = new Random().nextInt(20);
      }
    }

    // Agora vamos somar o array
    int soma = 0;
    for (int l = 0; l < numeros.length; l++) {
      for (int c = 0; c < numeros[l].length; c++) {
        //Somando
        soma += numeros[l][c];
      }
    }

    // este método imprime os valores do array bidimensional
    JOptionPane.showMessageDialog(null, "Valores do Array Bidimensional\n\n" + Arrays.deepToString(numeros));

    // Imprimindo a soma do array
    JOptionPane.showMessageDialog(null, "Soma dos elementos do array bidimensional\n\n" + soma);
  }
}

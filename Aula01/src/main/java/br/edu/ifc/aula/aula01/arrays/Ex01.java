package br.edu.ifc.aula.aula01.arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * Crie um array unidimensional de números inteiros e: imprima a soma de todos
 * os elementos do array.
 *
 * @author fabricio
 */
public class Ex01 {

  public static void main(String[] args) {
    int numeros[] = {6, 7, 4, 5, 9, 3, 44};
    int soma = 0;
    for (int i = 0; i < numeros.length; i++) {
      soma += numeros[i];
    }

    JOptionPane.showMessageDialog(null,
        "Soma dos números " + Arrays.toString(numeros) + "\n\n" + soma
    );
  }
}

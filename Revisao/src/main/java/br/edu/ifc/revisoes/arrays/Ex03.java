package br.edu.ifc.revisoes.arrays;

/**
 * Crie um array unidimensional de números inteiros e imprima somente os números
 * pares.
 *
 * @author fabricio
 */
public class Ex03 {

  public static void main(String[] args) {

    // array de números inteiros
    int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // percorrendo o array
    for (int i = 0; i < numeros.length; i++) {
      // verificando se é número par
      if (numeros[i] % 2 == 0) {
        System.out.println(numeros[i]);
      } else {
        System.out.println("IMPAR");
      }
    }

  }
}

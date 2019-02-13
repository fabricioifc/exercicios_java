package br.edu.ifc.revisoes.arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * Crie um array unidimensional com cinco números inteiros e: Utilizando
 * JOptionPane, solicite ao usuário um número, verifique se este número existe
 * ou não no array. Se encontrar o número, informe ao usuário qual posição do
 * array encontra-se o número Caso contrário, informe que o número não
 * encontra-se no array
 *
 * @author fabricio
 */
public class Ex04 {

  public static void main(String[] args) {
    // array de inteiros
    int numeros[] = {1, 2, 3, 4, 5};
    // usuário informa um número
    String entrada = JOptionPane.showInputDialog("Informe um número inteiro: ");
    Integer escolhido = Integer.parseInt(entrada);

    // verificando se o número escolhido é um elemento do array
    boolean existe = false;
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] == escolhido) {
        existe = true;
        JOptionPane.showMessageDialog(null, "O número [" + numeros[i] + "] foi encontrado na posição " + i + " do array!");
        // parar de percorrer o array, pois já encontrou
        break;
      }
    }
    // se não encontrou, imprime um aviso
    if (!existe) {
      JOptionPane.showMessageDialog(null, "O número escolhido [" + escolhido + "] não foi encontrado!");
    }
  }
}

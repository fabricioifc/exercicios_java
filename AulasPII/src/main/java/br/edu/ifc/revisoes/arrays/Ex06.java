package br.edu.ifc.revisoes.arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * Utilizando JOptionPane para entrada de dados, crie um programa para buscar
 * uma cor que está em um array unidimensional. Para isso você precisa: Criar um
 * array unidimensional do tipo String com as cores verde, amarelo, azul,
 * vermelho e preto. Pedir ao usuário (com JOptionPane) para informar o nome de
 * uma cor. Verificar se a cor solicitada existe dentro do array de cores. Se
 * existir escrever a mensagem “cor encontrada”, caso contrário, “cor não
 * encontrada”. Para verificar se a cor existe, basta utilizar o operador for e
 * o método equals da classe String.
 *
 * @author fabricio
 */
public class Ex06 {

  public static void main(String[] args) {
    //array de cores
    String cores[] = {"verde", "amarelo", "azul", "vermelho", "preto"};

    //perguntando ao usuário
    String corEscolhida = JOptionPane.showInputDialog("Informe o nome da cor: ");

    boolean existe = false;
    for (int i = 0; i < cores.length; i++) {
      if (cores[i].equals(corEscolhida)) {
        existe = true; // cor encontrada
        break; //saindo do loop
      }
    }
    if (existe) {
      JOptionPane.showMessageDialog(null, "Cor encontrada!");
    } else {
      JOptionPane.showMessageDialog(null, "Cor não encontrada!");
    }

  }
}

package br.edu.ifc.revisoes.arrays;

/**
 * Vamos criar uma tabela de dados: Crie um array unidimensional com três nomes
 * de pessoas (String[]) Crie um array unidimensional com três alturas de
 * pessoas (Double[]) Percorra um dos arrays para imprimir o nome e a idade das
 * pessoas
 *
 * @author fabricio
 */
public class Ex05 {

  public static void main(String[] args) {
    //array de pessoas
    String[] pessoas = {"João", "Maria", "Anastacia"};
    //array de alturas
    Double[] alturas = new Double[3];
    alturas[0] = 1.70D;
    alturas[1] = 1.45D;
    alturas[2] = 1.82D;

    // como os dois arrays tem o mesmo tamanho, 
    // basta percorrer um deles e imprimir o mesmo índice
    for (int i = 0; i < pessoas.length; i++) {
      System.out.println(pessoas[i] + " - " + alturas[i]);
    }
  }
}

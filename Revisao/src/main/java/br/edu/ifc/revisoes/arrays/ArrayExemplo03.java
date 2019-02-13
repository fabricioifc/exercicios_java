package br.edu.ifc.revisoes.arrays;

public class ArrayExemplo03 {

  public static void main(String[] args) {
    int linhas = 2, colunas = 3;

    int[][] matriz = new int[linhas][colunas];

    matriz[0][0] = 2;
    matriz[0][1] = 5;
    matriz[0][2] = 8;
    matriz[1][0] = 7;
    matriz[1][1] = 4;
    matriz[1][2] = 9;

    System.out.println("Tamanho: " + matriz.length);

    Integer soma = 0;
    StringBuilder sb = new StringBuilder();

    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if (c == 1) {
          soma += matriz[l][c];
          sb.append(matriz[l][c]).append(" ");
        }

      }
      sb.append(System.lineSeparator());
    }

    System.out.println(sb.toString());

  }
}

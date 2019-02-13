package br.edu.ifc.revisoes.metodos;

public class Ex09 {

  public static void main(String[] args) {
    String[][] pessoas = new String[3][2];

    pessoas[0][0] = "Jean";
    pessoas[0][1] = "10";
    pessoas[1][0] = "Jaime";
    pessoas[1][1] = "12";
    pessoas[2][0] = "Pedro";
    pessoas[2][1] = "20";

    Ex09 objeto = new Ex09();

    System.out.println(objeto.imprimir(pessoas));

  }

  public String imprimir(String[][] pessoas) {
    StringBuilder sb = new StringBuilder();
    for (int l = 0; l < pessoas.length; l++) {
      for (int c = 0; c < pessoas[l].length; c++) {
        sb.append(pessoas[l][c]).append(" ");
      }
      sb.append(System.lineSeparator());
    }

    return sb.toString();
  }
}

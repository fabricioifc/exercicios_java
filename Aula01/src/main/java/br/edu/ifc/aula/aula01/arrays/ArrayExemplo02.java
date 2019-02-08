package br.edu.ifc.aula.aula01.arrays;

import javax.swing.JOptionPane;

public class ArrayExemplo02 {

  public static void main(String[] args) {
    String auxiliar = null;
    int quantidade;
    Double[] notas;

    auxiliar = JOptionPane.showInputDialog(
        "Informe a quantidade de notas: "
    );
    quantidade = Integer.parseInt(auxiliar);
    notas = new Double[quantidade];

    for (int i = 0; i < notas.length; i++) {
      notas[i] = Double.parseDouble(
          JOptionPane.showInputDialog("Nota " + i)
      );
    }

    //Quantidade de notas
    System.out.println(notas.length);
    // Somar as notas (JAVA 8)
    System.out.println(somarNotas(notas));
    //Média das notas (JAVA 8)
    System.out.println(calcularMediaNotas(notas));

    // não ordenadas
    System.out.println(java.util.Arrays.asList(notas));

    //ordenado
    java.util.Arrays.sort(notas);
    System.out.println(java.util.Arrays.asList(notas));

  }

  public static Double somarNotas(Double notas[]) {
    return java.util.Arrays.
        stream(notas).
        mapToDouble(Double::doubleValue).sum();
  }

  public static Double calcularMediaNotas(Double[] notas) {
    return java.util.Arrays.
        stream(notas).
        mapToDouble(Double::doubleValue)
        .average().orElse(Double.NaN);
  }

}

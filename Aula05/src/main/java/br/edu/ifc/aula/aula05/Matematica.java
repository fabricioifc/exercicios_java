package br.edu.ifc.aula.aula05;

public class Matematica {

  private double calculo(double[] notas) {
    double soma = 0;
    for (int i = 0; i < notas.length; i++) {
      soma += notas[i];
    }
    return soma / notas.length;
  }

  public double calculo(double n1, double n2) {
    return calculo(new double[]{n1, n2});
  }

  public double calculo(double n1, int n2) {
    return calculo(new double[]{n1, n2});
  }

  public int media(int n1, int n2) {
    double soma = calculo(n1, n2);
    return Double.valueOf(soma).intValue();
  }

  public double media(String n1, String n2) {
    int numero1 = Integer.parseInt(n1);
    int numero2 = Double.valueOf(n2).intValue();

    return media(numero1, numero2);

  }

}

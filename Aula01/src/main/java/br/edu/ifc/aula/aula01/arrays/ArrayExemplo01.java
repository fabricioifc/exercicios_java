package br.edu.ifc.aula.aula01.arrays;

public class ArrayExemplo01 {

  public static void main(String[] args) {
    String[] semana = {
      "Domingo", "Segunda", "Terça", "Quarta",
      "Quinta", "Sexta", "Sábado"
    };

    // inicio para fim
    System.out.println("CRESCENTE");
    for (int i = 0; i < semana.length; i++) {
      System.out.println(i + " - " + semana[i]);
    }

    // fim para inicio
    System.out.println("DECRESCENTE");
    for (int i = semana.length - 1; i >= 0; i--) {
      System.out.println(i + " - " + semana[i]);
    }
  }
}

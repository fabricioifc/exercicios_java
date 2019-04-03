package br.edu.ifc.aula.aula05;

public class MatematicaTeste {

  public static void main(String[] args) {
    Matematica m = new Matematica();
    System.out.println(m.calculo(5.0, 6.5));
    System.out.println(m.calculo(10.0, 4));
    System.out.println(m.media(4, 6));
    System.out.println(m.media("4", "6.6"));
  }
}

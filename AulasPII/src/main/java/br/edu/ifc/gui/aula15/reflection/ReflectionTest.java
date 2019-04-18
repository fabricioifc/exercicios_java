package br.edu.ifc.gui.aula15.reflection;

import java.lang.reflect.Field;
import java.util.Arrays;

class Aluno {

  Long matricula;
  String nome;
  Integer idade;
  Double[] notas;

  public Aluno(Long matricula, String nome, Integer idade) {
    this.matricula = matricula;
    this.nome = nome;
    this.idade = idade;
    notas = new Double[4];
    notas[0] = 9.5;
    notas[1] = 7.9;
    notas[2] = 5.6;
    notas[3] = 4.5;
  }

}

public class ReflectionTest {

  public static void main(String[] args) throws Exception {
    Aluno a = new Aluno(123456L, "Antônio", 25);

    for (Field f : a.getClass().getDeclaredFields()) {
      f.setAccessible(true);
      System.out.println(f.getType() + " - " + f.getName() + " - " + f.get(a));

      double soma = 0D;
      if (f.getType().equals(Double[].class) && f.getName().equals("notas")) {
        Double[] notas = (Double[]) f.get(a);

        System.out.println(Arrays.toString(notas));
        for (int i = 0; i < notas.length; i++) {
          soma += notas[i];
        }
        System.out.println("Média: " + (soma / notas.length));

      }

    }
  }
}

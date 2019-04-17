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
  }

}

public class ReflectionTest {

  public static void main(String[] args) throws Exception {
    Aluno a = new Aluno(123456L, "Antônio", 25);
    a.notas[0] = 5.6;
    a.notas[1] = 8.6;
    a.notas[2] = 9.6;
    a.notas[3] = 6.4;

    for (Field f : a.getClass().getDeclaredFields()) {
      f.setAccessible(true);
      System.out.println(f.getType() + " - " + f.getName() + " - " + imprimirValor(f.get(a)));

      if (f.getType().equals(Double[].class)) {
        Double soma = 0D;
        Double[] lista = (Double[]) f.get(a);

        for (int i = 0; i < lista.length; i++) {
          if (lista[i] instanceof Double) {
            soma += lista[i];
          }
        }
        System.out.printf("\n\nMédia: %.2f ", (soma / lista.length));
      }
    }
  }

  public static String imprimirValor(Object objeto) {
    if (objeto instanceof Double[]) {
      Double[] lista = (Double[]) objeto;
      return Arrays.toString(lista);

    }
    return objeto.toString();
  }
}

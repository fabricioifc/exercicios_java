package br.edu.ifc.gui.aula15.reflection;

import java.lang.reflect.Field;

class Aluno {

  Long matricula;
  String nome;
  Integer idade;

  public Aluno(Long matricula, String nome, Integer idade) {
    this.matricula = matricula;
    this.nome = nome;
    this.idade = idade;
  }

}

public class ReflectionTest {

  public static void main(String[] args) throws Exception {
    Aluno a = new Aluno(123456L, "Antônio", 25);

    for (Field f : a.getClass().getDeclaredFields()) {
      f.setAccessible(true);
      System.out.println(f.getType() + " - " + f.getName() + " - " + f.get(a));

    }
  }
}

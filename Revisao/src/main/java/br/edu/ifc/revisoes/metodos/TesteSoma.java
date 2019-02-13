package br.edu.ifc.revisoes.metodos;

class Soma {

  public int umaVariavelNormal;
  public static int umaVariavelStatic;

  public int resultadoNormal(int num1, int num2) {
    umaVariavelNormal = (num1 + num2);
    return umaVariavelNormal;
  }

  public static int resultadoStatic(int num1, int num2) {
    umaVariavelStatic = (num1 + num2);
    return umaVariavelStatic;
  }
}

public class TesteSoma {

  public static void main(String[] args) {
    // criando um objeto
    Soma soma = new Soma();

    System.out.println(soma.resultadoNormal(10, 50));
    System.out.println(Soma.resultadoStatic(10, 50));
  }
}

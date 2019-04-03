package br.edu.ifc.poo.aula08.exercicios.ex03;

public class Main {

  public static void main(String[] args) {
    IdadeMaxMin objeto = new IdadeMaxMin(34, 56, 12, 78);
    
    Integer maiorIdade = objeto.verificarMaiorIdade();
    Integer menorIdade = objeto.verificarMenorIdade();
  }
}

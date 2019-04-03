package br.edu.ifc.poo.aula04.exercicios.ex02;

/**
 *
 * @author fabricio
 */
public class Play implements Jogo {

  @Override
  public void andar() {
    System.out.println("Andando");
  }

  @Override
  public void pular() {
    System.out.println("Pulando");
  }

  @Override
  public void chutar() {
    System.out.println("Chutando");
  }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.poo.aula03.ex01;

/**
 *
 * @author fabricio
 */
public class Gato extends Animal {

  public Gato(double peso, String comida) {
    super(peso, comida);
  }

  @Override
  public void correr() {
    System.out.println("Gato corrento!");
  }

  @Override
  public void fazerBarulho() {
    System.out.println("Miauh!");
  }

}

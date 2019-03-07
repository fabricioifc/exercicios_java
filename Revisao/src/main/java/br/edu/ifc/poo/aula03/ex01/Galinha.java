package br.edu.ifc.poo.aula03.ex01;

import br.edu.ifc.poo.aula03.*;
import javax.swing.JOptionPane;

public class Galinha
    extends Animal {

  public Galinha() {
    this(1.4, "Milho");
  }

  public Galinha(double peso,
      String comida) {
    super(peso, comida);
    super.id = 2;
  }

  @Override
  public void fazerBarulho() {
    JOptionPane.showMessageDialog(
        null,
        "Co Có!");
  }

  @Override
  public void correr() {
    System.out.println("Ciscando");
  }
}

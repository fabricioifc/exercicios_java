package br.edu.ifc.poo.aula03;

import javax.swing.JOptionPane;

public class Cachorro
    extends Animal {

  public Cachorro(double peso, String comida) {
    super(peso, comida);
    super.id = 1;
  }

  public Cachorro() {
    this(3, "Ração");
  }

  @Override
  public void fazerBarulho() {
    JOptionPane.showMessageDialog(
        null,
        "Au Au!");
  }
}

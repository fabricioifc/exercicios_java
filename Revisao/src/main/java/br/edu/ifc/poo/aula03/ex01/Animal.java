package br.edu.ifc.poo.aula03.ex01;

import br.edu.ifc.poo.aula03.*;
import javax.swing.JOptionPane;

public abstract class Animal {

  protected int id;
  private double peso;
  private String comida;

  public Animal(double peso, String comida) {
    this.peso = peso;
    this.comida = comida;
  }

  public void dormir() {
    JOptionPane.showMessageDialog(null, "Animal Dormindo!");
  }

  public abstract void correr();

  abstract public void fazerBarulho();

  public void fazerBarulhoSemPolimorfismo() {
    if (this instanceof Cachorro) {
      Cachorro obj = (Cachorro) this;
      obj.fazerBarulho();
    } else if (this instanceof Galinha) {
      Galinha obj = (Galinha) this;
      obj.fazerBarulho();
    } else {
      this.fazerBarulho();
    }
  }

}

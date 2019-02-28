package br.edu.ifc.poo.aula03;

import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {
    Animal generico = new Animal(6, "Peixe") {
      @Override
      public void fazerBarulho() {
        JOptionPane.showMessageDialog(null, "Miauuuu!");
      }
    };
    Animal toto
        = new Cachorro();
    Animal coco
        = new Galinha();

    // Sem polimorfismo
    generico.fazerBarulhoSemPolimorfismo();
    toto.fazerBarulhoSemPolimorfismo();
    coco.fazerBarulhoSemPolimorfismo();

    // Com polimorfismo
    generico.fazerBarulho();
    toto.fazerBarulho();
    coco.fazerBarulho();

  }
}

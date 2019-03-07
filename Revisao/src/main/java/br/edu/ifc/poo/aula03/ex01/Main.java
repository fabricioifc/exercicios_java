package br.edu.ifc.poo.aula03.ex01;

import br.edu.ifc.poo.aula03.*;
import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {
    Animal generico = new Animal(6, "Peixe") {
      @Override
      public void fazerBarulho() {
        JOptionPane.showMessageDialog(null, "Miauuuu!");
      }

      @Override
      public void correr() {
        System.out.println("Animal Correndo!");
      }
    };
    Animal toto
        = new Cachorro();
    Animal coco
        = new Galinha();
    Gato gato = new Gato(2.3, "Ração");

    // Sem polimorfismo
    generico.fazerBarulhoSemPolimorfismo();
    toto.fazerBarulhoSemPolimorfismo();
    coco.fazerBarulhoSemPolimorfismo();

    // Com polimorfismo
    generico.fazerBarulho();
    toto.fazerBarulho();
    coco.fazerBarulho();
    
    gato.fazerBarulhoSemPolimorfismo();
    gato.fazerBarulho();

  }
}

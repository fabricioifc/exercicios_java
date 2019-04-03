package br.edu.ifc.poo.aula01;

import javax.swing.JOptionPane;

public class Cachorro {

  String nome = "Buba";
  String raca;
  Integer tamanho;

  public void latir() {
    JOptionPane.showMessageDialog(
        null,
        this.nome
        + (this.tamanho > 10
            ? " Wo Wo!" : " Au Au!")
    );
  }

}

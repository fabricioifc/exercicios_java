package br.edu.ifc.aula.aula01.metodos;

import javax.swing.JOptionPane;

public class Ex07 {

  public static void main(String[] args) {
    String[] nomes = {"Fabricio", "José", "Alex", "Pedro",
      "Jean", "Roberto", "Gabriel", "Jaime", "Cleber", "Maria"};
    
    Ex07 objeto = new Ex07();
    int sorteado = objeto.sortear();
    JOptionPane.showMessageDialog(null, nomes[sorteado]);
  }

  public int sortear() {
    int sorteio = (int) (Math.random() * 9);
    return sorteio;
  }
}

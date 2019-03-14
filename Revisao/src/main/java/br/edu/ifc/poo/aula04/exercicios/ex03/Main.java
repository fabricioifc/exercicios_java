package br.edu.ifc.poo.aula04.exercicios.ex03;

import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {
    Calculo quadrado = new Quadrado(10);
    Calculo retangulo = new Retangulo(10, 20);
    Calculo triangulo = new Triangulo(10, 5);

    JOptionPane.showMessageDialog(null, "Área do quadrado: " + quadrado.calcularArea());
    JOptionPane.showMessageDialog(null, "Área do retângulo: " + retangulo.calcularArea());
    JOptionPane.showMessageDialog(null, "Área do triângulo: " + triangulo.calcularArea());
  }

}
